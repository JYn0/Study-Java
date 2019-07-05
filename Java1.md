**Whatis Java**

김지연

\- 자바 역사

1991년 제임스 고슬링을 포함한 썬 마이크로시스템즈의 연구원들에 의해 인터랙티브 TV(Interactive
TV)용 프로그램 작성을 위해 처음 개발되었다. 제임스 고슬링은 자신의 사무실 밖의 참나무를
보고 언어의 이름을 오크(Oak)라고 명명하였으나, 이는
이미 다른 회사의 상표로 등록되었기 때문에 이름을 변경해야 했다. 논의된 여러 후보 이름 중 커피를
좋아하는 연구팀원들에 의해 현재의 이름이 선택되었다. 
최초의 자바 공개 버전인 자바 1.0은 1995년에
출시되었다. [C언어](https://terms.naver.com/entry.nhn?docId=1179633&ref=y)에 비해 네트워크 환경 지원이 손쉬웠기 때문에 자바 [애플릿](https://terms.naver.com/entry.nhn?docId=1179551&ref=y) 형태로 웹 환경에서 널리 사용되었고, 이에 따라 1998년 12월에서 1999년에 걸쳐 출시된 자바2에서는 여러 다양한 플랫폼에서 사용할
수 있는 설정(configurations)을 지원하기 시작하였다. 자바2의 데스크톱 스탠다드 에디션은 Java SE(Java Platform,
Standard Edition) 로, Java EE(Java Platform, Enterprise
Edition)는 엔터프라이즈 환경에서, Java ME(Java Platform, Mobile
Edition)는 모바일 환경에서 필요한 기술과 [API](https://terms.naver.com/entry.nhn?docId=1179553&ref=y)들을 포함하고 있다. 
1995년 자바 1.0(JDK 1.0)이 출시된 이후 썬 마이크로시스템즈는 2006년 대부분의 자바 코드를 GPL 라이선스로 공개하였다. 2010년 썬이 [오라클](https://terms.naver.com/entry.nhn?docId=1200489&ref=y)에 인수된 이후 현재는 자바에 대한 관리 및 유지 보수는
오라클에서 담당하고 있다. 자바 버전은 일반적으로 Java SE 버전
혹은 JDK/JRE버전으로 관리된다.

 

\- 자바 특징

자바 언어는 다음 5가지의 핵심 목표를 지니고 있다.

\1. [객체 지향](https://ko.wikipedia.org/wiki/%EA%B0%9D%EC%B2%B4_%EC%A7%80%ED%96%A5) 방법론을 사용해야 한다.

\2. 같은 프로그램([바이트코드](https://ko.wikipedia.org/wiki/%EB%B0%94%EC%9D%B4%ED%8A%B8%EC%BD%94%EB%93%9C))이 여러 [운영 체제](https://ko.wikipedia.org/wiki/%EC%9A%B4%EC%98%81_%EC%B2%B4%EC%A0%9C)([마이크로프로세서](https://ko.wikipedia.org/wiki/%EB%A7%88%EC%9D%B4%ED%81%AC%EB%A1%9C%ED%94%84%EB%A1%9C%EC%84%B8%EC%84%9C))에서 실행될 수 있어야 한다.

\3. 컴퓨터 [네트워크](https://ko.wikipedia.org/wiki/%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC) 접근 기능이 기본으로 탑재되어 있어야 한다.

\4. 원격 코드를 안전하게 실행할 수 있어야 한다.

\5. 다른 객체 지향 언어들의 좋은 부분만 가지고 와서 사용하기 편해야 한다.

자바는 시스템 및
어플리케이션 개발자들에게 익숙하도록 C/C++과 유사한 문법을 가지고 있는 반면 C++에 비해 단순하고 효율성을 높이기 위해 여러 기능이 추가되었다. 네트워크
기능이 기본으로 탑재되도록 설계되었으며 하드웨어 아키텍처(컴퓨터 시스템의 물리적 구성요소와 그 상호
관계)에 중립적이고 안전하게 실행되는 언어를 목표로 개발되었다. 자바는 “write once, run anywhere”라는 슬로건 하에, 한
번 구현한 코드를 플랫폼에 독립적으로 사용할 수 있도록 특별히 설계되었다. 일반적으로 컴퓨터 프로그램은
사람이 이해하기 쉬운 고급 프로그래밍 언어를 사용해 작성되고 컴파일 과정을 통해 특정 CPU([중앙처리장치](https://terms.naver.com/entry.nhn?docId=1164231&ref=y))에서 실행 가능한 [기계어](https://terms.naver.com/entry.nhn?docId=1070603&ref=y) 코드로 변환된다. 하지만 자바 프로그램은
명령어 집합을 나타내는 한두 바이트의 코드인 바이트코드(Java bytecode)라는 특수한 바이너리
형태로 컴파일 된 후, 자바 가상 머신(JVM, Java
Virtual Machine) 상에서 실행된다. JVM은 자바 프로그램을 실행하기 위한
가상의 기계를 소프트웨어로 구성한 것으로, 자바 바이트코드를 CPU나
운영체제([OS](https://terms.naver.com/entry.nhn?docId=1180146&ref=y))에 관계없이 동일한 형태로 실행시킨다. 따라서 자바 가상 머신이 설치 가능하다면, 자바 어플리케이션을 운영체제나
하드웨어 플랫폼에 따라 변경함 없이 그대로 실행 가능하다. 이러한 점을 기반으로 자바는 널리 사용되는
프로그래밍 언어로 인기를 얻고 있으며, 특히 웹 어플리케이션 개발 언어로 가장 많이 사용되고 있다.

 

 

 

 

**Java vs C**

** **

C언어를 기반으로 만들어진 것이 자바 (C언어와 자바의 장점을 살려 만든것이 파이썬)

 

Java

① 자바는 객체지향언어 OOP (상속, 캡슐화등이 가능)이다.

② 클래스(class) 중심으로 프로그래밍을 한다. 모든코드를 클래스에서 짜고 main에서는 함수호출만 한다.

③ 국제규격의 유니코드 문자집합이다.

④ 객체지향언어는 클래스라는 개념을 도입하여 공통되는 메소드와 속성을 묶어서 분류함으로써 절차지향언어에 비해 소스코드가 줄고, 유지보수가 향상되며 가독성이 좋다.

⑤ 화면구성에 효과적인 언어이다.

 

C언어

① 순차(절차)지향언어이다. 위에서아래로 순서대로 읽으면서 실행하기 때문에 코드를 이해하기는 쉽다.

② 대부분 모든 코드를 main함수에서 만든다.

③ ANSI C 부분유니코드 문자이다.

④ 처리속도가 가장 빠른 언어이다.

 

 

**Java vs C++**

 

C++과 자바 언어의 차이는 각각의 탄생 역사에서부터 찾을 수 있다.

 

C++는 이름에서 나타나듯이 [C](https://ko.wikipedia.org/wiki/C_(%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D_%EC%96%B8%EC%96%B4))를 더 확장하여 만들었다.[절차적 프로그래밍](https://ko.wikipedia.org/wiki/%EC%A0%88%EC%B0%A8%EC%A0%81_%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D) 언어에 효율적인 실행을 목표로 설계되었다. 정적 자료형 검사 [객체 지향 프로그래밍](https://ko.wikipedia.org/wiki/%EA%B0%9D%EC%B2%B4_%EC%A7%80%ED%96%A5_%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D), [예외 처리](https://ko.wikipedia.org/wiki/%EC%98%88%EC%99%B8_%EC%B2%98%EB%A6%AC), [RAII](https://ko.wikipedia.org/w/index.php?title=RAII&action=edit&redlink=1), [제네릭 프로그래밍](https://ko.wikipedia.org/wiki/%EC%A0%9C%EB%84%A4%EB%A6%AD_%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D)을 지원한다. 범용컨터이너와 알고리즘을 포함한 [C++표준 라이브러리](https://ko.wikipedia.org/wiki/C%2B%2B_%ED%91%9C%EC%A4%80_%EB%9D%BC%EC%9D%B4%EB%B8%8C%EB%9F%AC%EB%A6%AC)도 추가되었다.

 

자바는 처음에는 가전제품에 탑재되어 네트워크 컴퓨팅을 지원하기 위해서 만들었다. 가상머신 위에서 실행되기 때문에 안전성을 가지며 또한 이식성이 높다. 하위 플랫폼을 완벽히 추상화시켜 주는광대한 분량의 라이브러리를 가지고 있다. 자바는 C와 비슷한문법을 사용할뿐 직접적인 호환성은 없다. 사용하기 편하고 많은 사람이 이해하기 쉬운 언어를 목표로 설계되었다.

 

두 언어는 개발의 목적이 다르기 때문에 결과적으로 서로 다른 원리, 방침, 설계에서 트레이드오프에 차이가 생겼다. 

 

 

라이브러리

 

자바에는 C++에 비해서 상당히 거대한 표준 라이브러리가 있다.C++의 표준 라이브러리는 문자열, 컨테이너, 입출력스트림 등의 비교적 범용적인 요소들만 제공한다. [자바SE](https://ko.wikipedia.org/wiki/%EC%9E%90%EB%B0%94_SE) 표준 라이브러리는 [컴퓨터 네트워크](https://ko.wikipedia.org/wiki/%EC%BB%B4%ED%93%A8%ED%84%B0_%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC), [그래픽 사용자 인터페이스](https://ko.wikipedia.org/wiki/%EA%B7%B8%EB%9E%98%ED%94%BD_%EC%82%AC%EC%9A%A9%EC%9E%90_%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4), [XML](https://ko.wikipedia.org/wiki/XML) 처리, 로깅, [데이터베이스](https://ko.wikipedia.org/wiki/%EB%8D%B0%EC%9D%B4%ED%84%B0%EB%B2%A0%EC%9D%B4%EC%8A%A4) 접근, [암호학](https://ko.wikipedia.org/wiki/%EC%95%94%ED%98%B8%ED%95%99), 기타 요소들을 모두 제공한다. 이런 추가 기능은 C++에서는 각자 구현할 필요없이 제3자(서드 파티) 라이브러리를 주로 이용한다.

 

C++은 C와 가장 [하위 호환성](https://ko.wikipedia.org/wiki/%ED%95%98%EC%9C%84_%ED%98%B8%ED%99%98%EC%84%B1)이 좋은 언어이다. C 라이브러리에있는 [운영 체제](https://ko.wikipedia.org/wiki/%EC%9A%B4%EC%98%81_%EC%B2%B4%EC%A0%9C)의 [API](https://ko.wikipedia.org/wiki/API) 같은 것을 C++에서는 직접 사용할 수 있다. 자바에서는 주로 플랫폼 종속적인 라이브러리로 가능한 여러 기능들을 [크로스 플랫폼](https://ko.wikipedia.org/wiki/%ED%81%AC%EB%A1%9C%EC%8A%A4_%ED%94%8C%EB%9E%AB%ED%8F%BC) 환경에서 대부분 가능하도록 하는 풍부한 표준 라이브러리를제공한다. 하지만 자바에서 운영 체제나 하드웨어 기능에 직접 접근하려면 [자바 네이티브 인터페이스](https://ko.wikipedia.org/wiki/%EC%9E%90%EB%B0%94_%EB%84%A4%EC%9D%B4%ED%8B%B0%EB%B8%8C_%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4)를 이용하여야만 한다.

 

 

런타임

 

C++은 보통 [기계어](https://ko.wikipedia.org/wiki/%EA%B8%B0%EA%B3%84%EC%96%B4)로 직접 컴파일되고, 이를[운영 체제](https://ko.wikipedia.org/wiki/%EC%9A%B4%EC%98%81_%EC%B2%B4%EC%A0%9C)가 실행한다. 자바는보통 [바이트코드](https://ko.wikipedia.org/wiki/%EB%B0%94%EC%9D%B4%ED%8A%B8%EC%BD%94%EB%93%9C)로 컴파일되고, [자바 가상 머신](https://ko.wikipedia.org/wiki/%EC%9E%90%EB%B0%94_%EA%B0%80%EC%83%81_%EB%A8%B8%EC%8B%A0)이 [인터프리터](https://ko.wikipedia.org/wiki/%EC%9D%B8%ED%84%B0%ED%94%84%EB%A6%AC%ED%84%B0) 방식으로 실행하거나 [JIT 컴파일러](https://ko.wikipedia.org/wiki/JIT_%EC%BB%B4%ED%8C%8C%EC%9D%BC%EB%9F%AC) 방식으로 기계어로 컴파일한 다음 실행한다. 이론상 [동적 재컴파일](https://ko.wikipedia.org/w/index.php?title=%EB%8F%99%EC%A0%81_%EC%9E%AC%EC%BB%B4%ED%8C%8C%EC%9D%BC&action=edit&redlink=1)은 두 언어 모두에 적용할 수 있으며 특히 자바에 유용하다. 하지만 현재 동적 재컴파일은 거의 쓰이지 않게 되었다.

C++의 다소 자유로운 표현력(배열 범위 검사 없음, 미사용포인터, 자료형 변환) 덕분에 컴파일시에 신뢰성 있는 검사가안 되고 런타임에 오류가 날 위험이 있다. 관련 오류로는 [버퍼 오버플로](https://ko.wikipedia.org/wiki/%EB%B2%84%ED%8D%BC_%EC%98%A4%EB%B2%84%ED%94%8C%EB%A1%9C), [세그먼테이션 폴트](https://ko.wikipedia.org/w/index.php?title=%EC%84%B8%EA%B7%B8%EB%A8%BC%ED%85%8C%EC%9D%B4%EC%85%98_%ED%8F%B4%ED%8A%B8&action=edit&redlink=1)가 있다. 하지만[STL](https://ko.wikipedia.org/wiki/%ED%91%9C%EC%A4%80_%ED%85%9C%ED%94%8C%EB%A6%BF_%EB%9D%BC%EC%9D%B4%EB%B8%8C%EB%9F%AC%EB%A6%AC)이 제공하는 고수준 추상 개념(벡터, 리스트, 맵)을 사용하면 오류를 피할 수 있다. 자바에서는 이런 오류는 아예 발생하지않거나 [자바 가상 머신](https://ko.wikipedia.org/wiki/%EC%9E%90%EB%B0%94_%EA%B0%80%EC%83%81_%EB%A8%B8%EC%8B%A0)에 적발되어 [예외 처리](https://ko.wikipedia.org/wiki/%EC%98%88%EC%99%B8_%EC%B2%98%EB%A6%AC) 형태로 응용 프로그램에게 보고한다.

 

자바는 배열의 범위를 벗어난 접근에 대해 명확하게 배열의 [경계 검사](https://ko.wikipedia.org/wiki/%EA%B2%BD%EA%B3%84_%EA%B2%80%EC%82%AC)를 요구한다. 이는불안정성을 줄이기는 하지만 일반적으로 실행 속도에 나쁜 영향을 준다. 일부 경우, 컴파일러의 분석으로 이런 문제는 모두 제거되어서 경계 검사가 불필요한 일이 되기도 한다. C++은 배열의 범위를 벗어난 접근에 대해 아무런 행동도 하지 않으므로 배열의 경계 검사는 하지 않는다. C++ 표준 라이브러리의 벡터 같은 콜렉션의 경우 선택적으로 경계 검사를 제공한다. 요약하자면, 자바 배열은"항상 안전하고, 엄격하게 검사하고, 가능하면빠르게" 이고, C++ 배열은 "항상 빠르게, 전혀 검사하지 않고, 잠재적 위험이 있는" 것이다.

 

 

 

**Java vs Java Script**

** **

Java를 다른 언어와 구분 짓는 가장 큰 특징은 컴파일된 코드가플랫폼 독립적이라는 것이다.

** **

JavaScript는사용자와 웹사이트가 서로 상호작용하는 데에 도움을 주는 기능을 제공한다.

사용자가 웹사이트의 화면에서 어떠한 액션을 일으켰을 때, 다른 페이지를 열지 않고도 변화된결과를 즉각적으로 보여준다.

** **

① 자바[스크립트](https://terms.naver.com/entry.nhn?docId=848218&ref=y)는 사용자 컴퓨터에 의해 인터프리트(interpreted)되는 언어이다(마치 HTML과 같이). 그러나 자바는 일단 서버측에서 컴파일해야 하고, [프로그램](https://terms.naver.com/entry.nhn?docId=857695&ref=y)의 실행은 사용자측에서 이루어진다.
② 두 언어 모두 객체 지향적 언어이다. 하지만 자바스크립트에는 상속성이나 클래스는 존재하지
않는다.
③ 자바스크립트는 HTML 코드에 끼워져서(embedded)사용되지만
자바는 HTML과 독립적으로 사용 가능하다. 단, HTML을 이용해야 자바 프로그램에 접근할 수 있다.
④ 자바스크립트는 흔히 루즈 타입(loose type)이라는 변수형을 선언할 필요가 없다. 반면에 자바는 항상 변수형을 선언해야 한다. 이 경우 스트롱 타입(strong type)이라 한다.
⑤ 자바스크립트는 [동적 연결](https://terms.naver.com/entry.nhn?docId=847857&ref=y)(dynamic binding)이기 때문에 객체에 대한 참조는 [실행시](https://terms.naver.com/entry.nhn?docId=831103&ref=y)에만 한다. 그러나
정적인 연결(static binding)을 취하는 자바는 컴파일시에 객체에 대한 참조가 이루어진다.
⑥ 두 언어 모두 안전하다. 그러나 자바스크립트의 경우는
HTML 코드에 직접 끼워져 있기 때문에 누구든지 볼 수가 있다. 그러나 자바의 경우는
다르다. 자바 소스 코드를 컴파일하면 바이트 코드로 불리는 클래스 파일이 생성된다. 따라서 [프로그램 작성자](https://terms.naver.com/entry.nhn?docId=861362&ref=y)가 디렉토리 안에 소스 코드를 지워도 HTML에서 부르는 것은 자바 클래스 파일이기 때문에 다른 사람이 그 소스를 보지 못한다는 점에서 차이가 있다.****