# scala-class offline
# This is eclipse project to study scala programming

강사 : 박성백 (sungbank@naver.com)
Blog : blog.naver.com/sungback

Blog => weB + LOG

1. 정보저장 : RDB + NoSQL
2. 정보처리 : 언어
   절차 -> 객체 -> 함수형
   C -> C++ -> Java -> Scala -> ?


  빅데이터 시조 .. 구글
  논문 1 : 빅데이터 저장 : 분산저장
  논문 2 : 빅데이터 처리 : MapReduce -> 하나식 합친다.

  자료구조 :
   List : 배열
   Set : 중복되지 않은 데이타, 데이터가 많아지면 느려짐
   Map : 키와 값 => 빅데어터 처리는 이걸

  Hadoop = HDFS(분산파일시스템) +

  구글의 50% 코드는 파이선으로 되어있다....

  애플 swift = oop + fp
  javascript,python,scala도 마찬가지...

  programing in scala  책 추천 : 스칼라 만든사람이 쓴 책...
  프로그래밍 스칼라 : 좀 더 쉬운 책...
  PLAY for SCALA : 스칼라의 스프링 격..
  스칼라 킬러 앱 => PLAY, AKKA, SPARK

  온라인으로 학습할 때 ...
  스칼라 학교 => https://twitter.github.io/scala_school/ko/
  https://www.tutorialspoint.com/scala/scala_arrays.htm
  http://coding-korea.blogspot.kr/2012/12/map-flatmap-foldleft.html
  핵심은 컬랙션 :  맵 -> 필터 -> 리듀스
  api 문서 => http://www.scala-lang.org/files/archive/api/current/#package , 검색란에 클래스명 입력

  구글에서
  scala class hierarchy diagram를 찾아서
  http://docs.scala-lang.org/tutorials/FAQ/collections


  OOP + 함수형 언어로...
  1. 파이선 : 자바와
  2. 자바스크립트 : 주로 웹영역..
  3. 스칼라 : 자바에서 돌아감. 자바 라이브러리를 사용가능

  스칼라에서는 if와 for를 지양한다. 가급적...
  if 대신 filter,
  for 대신 map 사용

  함수형 프로그래밍 정의
  - 함수의 값의 동작에 대한 수학적 규칙에 기반...
  - 부수효과가 없다. 주로 call by value, 순수함수를 더 많이 쓰자..

인텔리J 커뮤니티 버전 => 무료, 스칼라 가능함.
에디터 => sublime text 3 , https://www.sublimetext.com/3
prefreence

다음 언어는 클로저???

스칼라 환경
1. Scala REPL : 간단 테스트
2. 편집기 : sublimetext : 약간 긴 소스
3. 개발툴 : ScalaIDE

꼬리 재귀란 : recursive call을 많이 하면 stack overflow 발생.
              이를 방지하기 위해 중간값을 저장하는 방식으로 이를 방지
              스칼라에서는 scala.annotation.tailrec를 통해 지원

함수형 언어의 특징
 - 함수를 변수에 대입
 - 함수를 인자로 넘길 수 있다.
 - 함수 실행 결과로 함수를 리턴 할 수 있다.

함수의 인자로 함수가 들어오는 것을 고차 함수인데
대표적인 것이 map,filter,reduce등이 있다.

파이선이 배우기도 좋고 쉽지만 좀 느리다...
GIL(Global Interpreter Lock) 때문에 좀 느리다.

       자바 파이선 스칼라
자료형 많음  적음   많음
메소드 적음  많음   많음


