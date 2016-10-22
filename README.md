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

  Hadoop = HDFS(분산파일시스템) +MapReduce(분산처리)
  Java로 처리하면 소스 길이가 길어짐.
  분산처리(MapReduce) 부분을 spark(함수형)로 처리

  Spark에는 분산처리 뿐 아니라 머신러닝 라이브러리, hive등 여러 기능이 있다.
  본래 Python에서 MapReduce를 했고, 더 다양한 라이브러리가 지원된다.

  구글의 50% 코드는 파이선으로 되어있다....

  애플 swift = oop + fp
  javascript,python,scala도 마찬가지...

<책 추천>
  프로그래밍 스칼라 : 좀 더 쉬운 책...
  programing in scala  책 추천 : 스칼라 만든사람이 쓴 책...
  PLAY for SCALA : 스칼라의 스프링 격..
  스칼라 킬러 앱 => PLAY, AKKA, SPARK
    Akka : 동시성 처리
    Spark : 빅이터 처리
    Play : Web

  Web framework
    Java의 Spring
    Scala의 Play
    sJavascript의 nodejs

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

  함수형 프로그래밍 정의 ? 특징
  - 함수의 값의 동작에 대한 수학적 규칙에 기반...
  - 부수효과가 없다. 주로 call by value, 순수함수를 더 많이 쓰자..
  - 변수에 함수를 할당할수 있다.
  - 함수의 인자로 함수를 넘긴다.
    (함수를 인자로 받는 함수를 고차 함수라고 한다. 인자로 넘어간 함수를 선언적 함수라고 한다.)
    map,reduce,filter가 대표적인 고차함수,

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

       OOP  FunP   OOP+FunP
       자바 파이선 스칼라
자료형 많음  적음   많음
메소드 적음  많음   많음


Reduce
1,2,3,4,5,6
reduceLeft() 1,2,3,4 순서로 처리
reduceRight() 6,5,4,3 순서로 처리

Curring
abc(x)(y) -> def(y)
x는 초기값, ys는 처리

C++은 다중상속 가능 => 죽음의 다이어몬드 문제
A <- B <- D
  <- C <-

Java는 단일상속, 다중 인터페이스 구현 제공
스칼라는 trait를 이용해서 다중 상속을 허용하지만 죽음의 다이어몬드 문제는
마지막 상속의 것을 쓰도록 하여 해결함.

Java class의 경우 DAO의 getter/setter 메서드를 구현하는데 소스가 길어짐
스칼라에서는 class 앞에 case를 붙이면 컴파일시 메서드를 자동으로 만들어준다.

ORM (Object Relational Mapping)
-> Java의 hibernate
     . java로 업데이트/삭제 등의 동작을 하면 db에서 업데이트, 삭제를 함.
     . 단순 테이블에서는 간단하지만 데이블이 복잡하면 어려워짐.




python ipython
       => ipython notebook
      => jupyter

spark notebook => http://spark-notebook.io 윈도우에서 실습할 수 있는 도구
최신버전 다운로드 > http://spark-notebook.io/dl/zip/0.6.3/2.11/1.6.2/2.7.3/true/true

spark 책 추천
러닝 스파크

JS 엔지니어가 많다.
JS 앱스토어 (하위 호환성???)
JS 앱을 Win/Mac/안드로이드에 설치하고 실행할 수 있게 하는 프래임웍

인터넷회사를 가상에 만들고
직원을 채용하고
전세계에서 일할 수 있고
월급을 줄수 있는 시스템...
각 나라에 정산 시스템이 있어야 함.



c:\spark-notebook-0.6.3에 압축해제
cd c:\spark-notebook-0.6.3
c:\spark-notebook-0.6.3> bin\spark-notebook
localhost:9000에 접속
  오른쪽 new에서 scala ..선택 -> ex01 이름 입력
  http://spark.apache.org/examples.html에 있는 예제 입력

  val textFile = sc.textFile("README.md")

