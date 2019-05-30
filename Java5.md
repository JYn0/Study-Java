## 배열(array)

* 배열(array) : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
* 타입[] 변수이름;   /   타입 변수이름[];
* 변수이름 = new 타입[길이];
* 인덱스(index) : 배열의 요소마다 붙여진 일련번호(0~ 배열길이-1)
* 배열의 길이는 int범위의 양의 정수(0포함)이어야 한다.
* 배열이름.length
* int[] iArr = {1, 2, 3};
  * System.out.println(Arrays.toString(iArr)); // [1, 2, 3]
  * system.out.println(iArr); // 주소 출력



* 다차원 배열(multi-dimensional)

```
int[][] aaa;
int aaa[][];
int[] a[];
for(int[] tmp : aaa){
	for(int i: tmp)
		sum += i;
}
```
