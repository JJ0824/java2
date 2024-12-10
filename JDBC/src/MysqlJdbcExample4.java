import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MysqlJdbcExample4 {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    // #1. 재고수량을 매개변수로 전달하고 재고수량 미만인 제품의 제품번호,제품명,총주문건수 조회
    // Map을 사용하여 메서드내에서 출력하도록 구현
    public void getProductsWithStock(int stock) {
        String query = "select 제품.제품번호, 제품명, count(*) as 총주문건수 "
                + "from 제품 inner join 주문세부 "
                + "on 제품.제품번호 = 주문세부.제품번호 "
                + "where 재고 < ? "
                + "group by 제품.제품번호, 제품명";

        List<Map<String, Object>> pos= new ArrayList<>();

        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, stock);
                try(ResultSet rs = pstmt.executeQuery()) {
                    while (rs.next()) {
                        Map<String, Object> po = new HashMap<>();
                        po.put("제품번호", rs.getInt("제품번호"));
                        po.put("제품명", rs.getString("제품명"));
                        po.put("총주문건수", rs.getInt("총주문건수"));

                        pos.add(po);
                    }

                    for (Map<String, Object> po : pos) {
                        System.out.println(po);
                    }
                }
            }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // #2. 매개변수로 날짜(date)와 기간(개월수)(month)를 전달하고 해당 날짜를
    // 기준으로 개월수이내의 주문정보를 골라 아래 컬럼을 조회
    // 예를들어, 2022-02-01 기준으로 3개월 이내의 주문정보
    // 사원번호, 이름, 직위
    public void getEmployeesWithDuration(String date, int month) {
        String query = "select 사원번호, 이름, 직위 from 사원 "
                + "where 사원번호 in (select 사원번호 from 주문 where 주문일 >= "
                + "adddate(?, interval -? month))";
        List<Map<String, Object>> eos = new ArrayList<>();

        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, date);
            pstmt.setInt(2, month);
            try(ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Map<String, Object> eo = new HashMap<>();
                    eo.put("사원번호", rs.getString("사원번호"));
                    eo.put("이름", rs.getString("이름"));
                    eo.put("직위", rs.getString("직위"));

                    eos.add(eo);
                }
            }
            for (Map<String, Object> eo : eos) {
                System.out.println(eo);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // #3. 매개변수로 도시를 전달하고 해당도시별 고객들에 대한 주문년도별 주문건수 조회
    public void getNumOfOrdersByCity(String city) {
        String query = "select year(주문.주문일) as 주문년도, count(*) as 주문건수 "
                + "from 주문 inner join 고객 on 주문.고객번호 = 고객.고객번호 "
                + "where 고객.도시 = ? group by year(주문.주문일) order by 주문년도";
        List<Map<String, Object>> ordersByCities = new ArrayList<>();

        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, city);
            try(ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Map<String, Object> ordersByCity = new HashMap<>();
                    ordersByCity.put("주문년도", rs.getInt("주문년도"));
                    ordersByCity.put("주문건수", rs.getInt("주문건수"));
                    ordersByCities.add(ordersByCity);
                }
            }
            for (Map<String, Object> ordersByCity : ordersByCities) {
                System.out.println(ordersByCity);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MysqlJdbcExample4 repository = new MysqlJdbcExample4();
//        repository.getProductsWithStock(4);
//        repository.getEmployeesWithDuration("2021-03-01",1);
        repository.getNumOfOrdersByCity("서울특별시");
    }
}