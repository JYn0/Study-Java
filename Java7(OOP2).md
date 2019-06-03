# 객체지향 프로그래밍(Object-oriented Programming)

상속 / 오버라이딩 / package와 import / 제어자 / 추상클래스 / 인터페이스 / 내부 클래스



* ### 상속(inheritance)

  : 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것

  |             |                                                             |
  | :---------: | :---------------------------------------------------------: |
  | 조상 클래스 | 부모(parent) 클래스, 상위(super) 클래스, 기반(base) 클래스  |
  | 자손 클래스 | 자식(child)클래스, 하위(sub) 클래스, 파생된(derived) 클래스 |

  상속관계 :  ~은 ~이다. is -a

  포함관계 : ~은 ~을 가지고 있다. has -a

  ```java
  clas Child extends Parent{
  	// ...
  }
  ```



* 오버라이딩(ovdrriding)

  : 조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것

| 자손 클래스에서 오버라이딩하는 메서드는 조상 클래스의 메서드와 |
| ------------------------------------------------------------ |
| 이름이 같아야 한다.  /  매개변수가 같아야 한다.  /  반환타입이 같아야 한다. |

| 조상 클래스의 메서드를 자손 클래스에서 오버라이딩할 때       |
| ------------------------------------------------------------ |
| 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다. |
| 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.         |
| 인스턴스메서드를 static메서드로 또는 그 반대로 변경할 수 없다. |

* #### super

  : 자손클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수이다.

    상속받은 멤버와 자신의 클래스에 정의된 멤버의 이름이 같을 때 super를 붙여서 구별할 수 있다.

  ```java
  class SuperTest{
  	public static void main(String args[]){
  	Child c = new Child();
  	c.method();
  	}
  }
  class Parent{
      int x=10;
  }
  class Child extends Parent{
      int x=20;
      void method(){
          System.out.println("x="+x);					//20
          System.out.println("this.x="+this.x);		//20
          System.out.println("super.x="+super.x);		//10
      }
  }
  ```

  Object클래스를 제외한 모든 클래스의 생성자 첫 줄에 생서자 this() 또는 super()를 호출해야 한다. 그렇지않으면 컴파일러가 자동적으로  super();를 생성자의 첫줄에 삽입한다.

  조상클래스의 멤버변수는 조상의 생성자에 의해 초기화되도록 해야 한다.

* ### 패키지(package)와 import

  package 패키지명;

  소스파일(*.java)의 구성 : package문 - import문 - 클래스 선언



* ### 제어자(modifier)

  :  클래스, 변수 또는 메서드의 선언부에 함께 사용되어 부가적인 의미 부여

  |    종류     |                                                              |
  | :---------: | :----------------------------------------------------------: |
  | 접근 제어자 |             public, protected, default, private              |
  |    그 외    | static, final, abstract, native, transient, synchronized, volatile, strictfp |

  * static - 클래스의, 공통적인

    : 멤버변수, 메서드, 초기화 블럭

      클래스변수(static 멤버변수)는 인스턴스에 관계없이 같은 값을 갖는다. 하나의 변수를 모든 인스턴스가 공유

  * final - 마지막의, 변겨오딜 수 없는

    : 클래스, 메서드, 멤버변수, 지역변수

      변수에 사용되면 값을 변경할 수 없는 상수가 되며, 메서드에 사용되면 오버라이딩을 할 수 없게되고 클래스에 사용되면 자신을 확정하는 자손클래스를 정의하지 못하게 된다.

  * abstract - 추상의, 미완성의

    : 클래스 ,메서드

      메서드의 선언부만 작성하고 실제 수행내용은 구현하지 않은 추상 메서드를 선언하는데 사용된다.

      추상 클래스는 아직 완성되지 않은 메서드가 존재하는 '미완성 설계도'이므로 인스턴스를 생성할 수 없다.

    ```java
    abstract class AbstractTest{ // 추상 클래스
    	abstract void move();	 // 추상 메서드
    }
    ```

  * 접근 제어자(access modifier)

    | 접근 제어자가 사용 | 클래스, 멤버변수, 메서드, 생성자                             |
    | :----------------: | ------------------------------------------------------------ |
    |      private       | 같은 클래스 내에서만 접근이 가능하다.                        |
    |      default       | 같은 패키지 내에서만 접근이 가능하다.                        |
    |     protected      | 같은 패키지 내에서,  다른 패키지의 자손클래스에서 접근이 가능. |
    |       public       | 접근 제한이 전혀 없다.                                       |

  * 제어자(modifier)의 조합

    |   대상   |             사용가능한 제어자             |
    | :------: | :---------------------------------------: |
    |  클래스  |    public, (default), final, abstract     |
    |  메서드  | 모든 접근 제어자, final, abstract, static |
    | 멤버변수 |      모든 접근 제어자, final, static      |
    | 지역변수 |                   final                   |

    * 메서드에 static과 abstract를 함께 사용할 수 없다.
    
    * 클래스에 abstract와 final을 동시에 사용할 수 없다.
    
    * abstract메서드의 접근 제어자가 private일 수 없다.
    
    * 메서드에 private과 final을 같이 사용할 필요는 없다.
    
      
  
* ### 다형성(polymorphism)

  : 한타입의 참조변수로 여러 타입의 객체를참조할 수 있도록 함

    조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 함

* ### 추상클래스(abstract class)

* ### 인터페이스(interface)

  ```java
  interface 인터페이스이름{
  	public static final 타입 상수이름 = 값;
  	public abstract 메서드이름(매개변수목록);
  }
  ```

  * 모든 멤버변수는 public static final 이어야 하며, 이를 생략할 수 있다.
  * 모든 메서드는 public abstract이어야하며, 이를 생략할 수 있다.
  * 개발시간 단축 / 표준화 / 관계 / 유지보수 / 독립적인 프로그래밍 가능

* ### 내부 클래스(inner class)