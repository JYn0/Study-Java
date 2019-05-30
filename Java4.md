## 조건문과 반복문 (if, switch, for, while statement)

* 조건문 - if, switch

```java
if(조건식1){
	if{
	}else{
	}
}else if(조건식2){
}
```

```java
switch(조건식){
	case 값1:
	break;
	case 값2:
	break;
	default:
	break;
}
```

* 반복문 - for, while, do-while

```java
for(초기화; 조건식; 증감식){
	수행될 문장
	System.out.println("JAVA");
}
for(타입 변수명 : 배열 또는 컬렉션){
}
for(int tmp : arr){
	System.out.println(tmp);
}
```

```java
while(조건식){
	수행될 문장
	break; //-> while문을 벗어난다.
}
do{

}while(조건식);
```

* continue문

  : 반복문 내에서만 사용

    continue문을 만나면 반복문의 끝으로 이동하여 다음 반복문으로 넘어간다.

    반복문 전체를 벗어나지 않고 다음 반복문을 계속 수행

```java
for(int i=0; i<=10; i++){
	if(i%3 == 0){
		continue;
	System.out.println(i);
	}
}
// 1 2 4 5 7 8 10
```

* 이름 붙은 반복문

  : 중첩 반복문 앞에 이름을 붙이고 break문과 continue문에 이름을 지정해 줌으로써 하나 이상의 반복문을 벗어나거나 반복을 건너뛸 수 있다.

  
