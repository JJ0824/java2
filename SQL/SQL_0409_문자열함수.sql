-- char_length 문자의 갯수
-- length 바이트 수
select char_length('hello'), -- 문자의 갯수
length ('hello'), -- 바이트 갯수
char_length('안녕'), -- 글자 갯수
length('안녕'); -- 바이트 갯수

-- concat -- 문자열을 연결
-- concat_ws(ws= with separator) = 문자열을 구분자와 함께 연결
select concat('dreams', 'come', 'true'),
concat_ws('-','2023','01','29');  

-- left -- 문자열의 왼쪽부터 몇개
-- right -- 문자열의 오른쪽부터 몇개
-- substr -- 몇번째부터 몇개
select left ('SQL 공부', 3), -- 왼쪽부터 3개 = SQL
right('SQL 공부', 2), -- 오른쪽부터 2개 = 공부
substr('SQL 공부', 3, 4), -- 3개부터 4개 = 스페이스 공부
substr('SQL 공부',5); -- 5부터 끝까지 = 공부

-- substring_index 구분자를 만날때까지 문자열을 잘라냄
-- 인덱스는 몇번째 구분자를 만날때까지 자를지를 결정
-- 인덱스가 음수(-)면 오른쪽부터
select substring_index('서울시 동작구 흑성동',' ',1); -- 서울시
select substring_index('서울시 동작구 흑성동',' ',2); -- 서울시 동작구
select substring_index('서울시 동작구 흑성동',' ',-1); -- 흑성동
select substring_index(substring_index('서울시 동작구 흑성동',' ',2),' ', -1); -- 동작구

-- lpad 지정한 길이에서 문자열을 제외한 나머지를 특수문자로 왼쪽부터 채움
-- rpad 오른쪽부터 채움
select  lpad('sql', 10, '#'), -- #######sql
rpad('sql', 5, '*'); -- sql**

-- ltrim 왼쪽 공백 제거
-- rtrim 오른쪽 공백 제거
-- trim 양쪽 공백 제거
select ltrim('     sql'), -- 왼쪽 공백 제거
rtrim('sql      '), -- 오른쪽 공백 제거
trim('   sql   ');  -- 양쪽 공백 제거

-- field 문자열의 위치를 찾음
-- field (찾는문자열, 문자열1, 문자열2, 문자열3, .....)
-- find_in_set 문자열 리스트에서 지정한 문자열을 찾음
-- find_in_set(찾는 문자열, 문자열리스트)
select field('java', 'sql', 'java', 'javascript'); -- 2
select find_in_set('java', 'sql,java,javascript'); -- 2

-- locate 기준문자열에서 부분문자열의 위치를 찾음
-- locate(부분문자열, 기준문자열) -- 선언방법
select locate('world', 'hello world.'); -- 7


-- elt 지정한 위치에 있는 문자열을 반환
select elt(2, 'sql', 'java', 'javascript'); -- 2

-- repeat 문자열의 반복
select repeat('*', 5);

-- replace 문자열의 일부를 다른 문자열로 대체
-- replace(기준문자열, 바꿀 문자열, 바뀔 문자열) -- 선언방법
select replace('010_1234_5678', '_','-'); -- 언더바를(_) 대쉬(-)로 바꿈 010-1234-5678

-- reverse 문자열 거꾸로 바꿈
select reverse('hello'); -- olleh 















