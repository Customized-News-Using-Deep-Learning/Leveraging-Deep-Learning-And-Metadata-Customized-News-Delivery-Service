# Leveraging-Deep-Learning-And-Metadata-Customized-News-Delivery-Service
이 프로젝트는 뉴스 기사의 특성을 뽑아 메타데이터를 생성하여 사용자별 맞춤 기사를 제공하기 위한 딥러닝과 메타데이터를 활용한  사용자 맞춤 뉴스 제공 서비스입니다.

***

## NewSpace

안홍선<br>
김석영<br>
박종성<br>
지범수<br>
문하영<br>
윤  별<br>

***


## 프로젝트 수행 과정
> 핵심과제

1. 뉴스 기사의 특성을 뽑아 메타데이터(데이터를 설명하는 데이터) 생성
2. 메타데이터를 활용하여 형태별(사실전달/해설묘사) 기사 제공
3. 기사 요약 서비스 제공
4. 기사에 나오는 어려운 용어들 각주로 설명
5. 기사 스크랩, 즐겨찾기 기능 제공

> 접근 방식

1. 크롤링한 뉴스 데이터를 직접 사실전달과 해설 묘사로 라벨링하여 분류한다.
2. 딥러닝을 통해 분류된 기사를 학습시켜 분류 되지 않은 뉴스의 형태를 예측하여 정확도를 확인한다.

***
## 화면 구성

<img src="./images/화면1.png" width="700px" height="400px" title="px(픽셀) 크기 설정" alt="RubberDuck"></img><br/>
<img src="./images/화면1.png" width="700px" height="400px" title="px(픽셀) 크기 설정" alt="RubberDuck"></img><br/>
<img src="./images/화면1.png" width="700px" height="400px" title="px(픽셀) 크기 설정" alt="RubberDuck"></img><br/>

***
## DB

<img src="./images/db1.png" width="700px" height="400px" title="px(픽셀) 크기 설정" alt="db"></img><br/>

> 테이블
1. 사용자 : 사용자 ID, 비밀번호, 이름, 연령대, 성별, 이메일
2. 뉴스 : 뉴스 번호, 제목, 요약, 기자, 시간, 언론사, 메타 데이터, 기사 내용, 이미지, 카테고리, 조회수
3. 태그 : 태그 번호, 태그 이름
4. 용어 분야 : 용어 분야 번호, 분야 이름
5. 용어 : 용어 번호, 용어 분야 번호, 용어 이름, 용어 설명

***
## 딥러닝

> 텍스트 마이닝

> Char-level-CNN