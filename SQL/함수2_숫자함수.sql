-- 함수2_숫자함수.sql

use testdb;

-- ceiling 올림
-- floor 내림
-- round 반올림
-- round 두 번째 매개변수를 지정하면 반올림하는 위치를 정할 수 있음
-- truncate 버림, 위치를 지정 가능
-- 소수점위치를 지정하는 숫자는 표현하고 싶은 소수점 자리 개수를 의미함 (예. 소수점 이하 두 자리만 표현)
select ceiling(123.06),
	floor(123.99),
	round(123.56),
	round(123.56, 1), -- 소수점 이하 한 자리
	truncate(123.56, 1), -- 소수점 이하 한 자리
	truncate(123.56, 2); -- 소수점 이하 두 자리
-- abs 절대값
-- sign 음수는 -1, 양수는 1을 반환
select abs(-120), sign(-120), sign(120); 

-- power 제곱
-- sqrt(ssquare root) 제곱근
-- rand 랜덤넘버
-- rand함수의 매개변수 see. 동일 seed는 동일 랜덤넘버가 나옴
select power(2,3); -- 8 (2^3)
select sqrt(16); -- 4 (16 = 4*4)
select rand(); -- 0과 1사이에 랜덤넘버
select rand(100); -- 항상 동일한 랜덤넘버
select rand(200);
 
