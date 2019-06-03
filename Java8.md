# 예외처리(exception handling)

* 예외처리

  ```java
  try{
  	// 예외가 발생할 가능성이 있는 문장들을 넣는다.
  } catch (Exception e){
      // Exception1이 발생하였을 경우, 이를 처리할 문장을 적는다.
  }
  ```

  * try블럭 내에서 예외가 발생한 경우,

    발생한 예외와 일치하는 catch 블럭이 있는지 확인

    일치하는 catch 블럭을 찾게되면, 그 catch블럭 내의 문장들을 수행하고 전체 try-catch문을 빠져나가서 그 다음 문장을 계속해서 수행한다.

    만일 일치하는 catch 블럭을 찾지 못하면, 예외는 처리되지 못한다.

  * try 블럭 내에서 에외가 발생하지 않는 경우,

    catch 블럭을 거치지 않고 전체 try-catch문을 빠져나가서 수행을 계속한다.

    

  * 예외 발생시키기

    ```java
    // 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음
    Exception e = new Exception("고의로 발생시켰음");
    // 키워드 throw를 이용해서 예외를 발생시킨다.
    throw e;
    ```

    

  * finally 블럭

    : finally 블럭은 try-catch문과 함께 예외의 발생여부에 상관없이 실행되어야할 코드를 포함시킬 목적으로 사용된다. try-catch문의 끝에 선택적으로 덧붙여 사용할 수 있으며, try-catch-finally의 순서로 구성된다.

    ```java
    try{
    	// 예외가 발생할 가능성이 있는 문장들을 넣는다.
    } catch (Exception e){
        // Exception1이 발생하였을 경우, 이를 처리할 문장을 적는다.
    } finally{
        // 예외의 발생여부에 관계없이 항상 수행되어야하는 문장들을 넣는다.
        // finally블럭은 try-catch문의 맨 마지막에 위치해야한다.
    }
    ```

    