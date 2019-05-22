# Github Bash

* mkdir : 폴더만들기
* ls : list
* cd : change dir
* tab : 자동완성
* .. : 상위폴더
* mv 파일 위치 : 이동
* git init
* git status : 상태
* git add 관리할폴더
* git commit -m "넣을 메시지"
  * commit == save

* git config --global user.email ".com"
* git config --global user.name "이름"
* git log : git을 통해 저장한 저장본
* git remote add origin https://github.com/JYn0/TIL0.git
  * 원격 저장소 주소

* git push -u origin master



# Github

"+" -> new repository 폴더만들기



# 순서

프로젝트를 처음 생성할 떄

```
git init
git status //상위폴더에서
git add [폴더]
git commit -m "Git 내용 정리"
git remote
git push -u origin master
```

## 이미 만들어진거 다시 올리기

```
git add [파일명]
git add . //한번에 여러파일 추가
git commit -m "메시지"
git push -u
```

git add 190521/github.md

