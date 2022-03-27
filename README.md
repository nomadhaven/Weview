# Weview

### 다양한 영화를 장르별로 큐레이팅해주는 웹 페이지 입니다.

##### 정상적인 페이지를 보기 위해서는 아래의 DB TABLE을 생성하여야 합니다. 아래의 절차별로 테이블 생성을 부탁드립니다.


```

-- !!!! 시퀀스 테이블 추가하기 !!!!

CREATE SEQUENCE SEQ_MOVIE INCREMENT BY 1 START WITH 1 MAXVALUE 1000 MINVALUE 1;
CREATE SEQUENCE SEQ_MEMBER INCREMENT BY 1 START WITH 1 MAXVALUE 1000 MINVALUE 1;
CREATE SEQUENCE SEQ_REQUEST INCREMENT BY 1 START WITH 1 MAXVALUE 1000 MINVALUE 1;

 -- 1.액션 
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '007 노 타임 투 다이', '액션', '캐리 후쿠나가', '미국', '다니엘 크레이그/라미 말렉/라샤나 린치/레아 세이두/벤 위쇼', '2021-09-29', 12, 163, '줄거리', 0.0, 'https://www.youtube.com/watch?v=kCzbDJ2G_B8', '1-1.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '이탈리안 잡', '액션', 'F. 게리 그레이', '미국', '마크 월버그/샤를리즈 테로느/에드워드 노튼/세스 그린/제이슨 스타뎀', '2003-10-02', 15, 103, '줄거리', 0.0, 'https://youtu.be/uw6jY3VuOcI', '1-2.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '다이하드:굿 데이 투 다이', '액션', '존 무어', '미국', '브루스 윌리스/제이 코트니/메리 엘리자베스 윈스티드/율리아 스니가르/세바스티안 코치', '2013-02-06', 15, 96, '줄거리', 0.0, 'https://youtu.be/JVjqnWsBxb0', '1-3.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '미션 임파서블: 폴아웃', '액션', '크리스토퍼 맥쿼리', '미국', '톰 크루즈/헨리 카빌/사이먼 페그/레베카 퍼거슨/빙 라메스', '2018-07-25', 15, 147, '줄거리', 0.0, 'https://youtu.be/wb49-oV0F78', '1-4.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '레드: 더 레전드', '액션', '딘 패리소트', '미국', '브루스 윌리스/이병헌/캐서린 제타 존스/안소니 홉킨스/존 말코비치', '2013-07-18', 15, 115, '줄거리', 0.0, 'https://youtu.be/ZfB8QwYBPxY', '1-5.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '킹스맨: 퍼스트 에이전트', '액션', '매튜 본', '영국', '랄프 파인즈/해리 딕킨슨/리스 이판/젬마 아터튼/디몬 하운수', '2021-12-22', 20, 130, '줄거리', 0.0, 'https://youtu.be/qmplEPm3RUI', '1-6.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '분노의 질주: 더 얼티메이트', '액션', '저스틴 린', '미국', '빈 디젤/존 시나/성 강/샤를리즈 테론/미셸 로드리게즈', '2021-05-19', 12, 142, '줄거리', 0.0, 'https://youtu.be/L9Y-hn2COm0', '1-7.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '스파이더맨: 노 웨이 홈', '액션', '존 왓츠', '미국', '톰 홀랜드/젠데이아 콜먼/베네딕트 컴버배치/존 파브로/제이콥 배덜런', '2021-12-15', 12, 148, '줄거리', 0.0, 'https://youtu.be/JfVOs4VSpmA', '1-8.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, 'A-특공대', '액션', '조 카나한', '미국', '리암 니슨/브래들리 쿠퍼/제시카 비엘/퀸튼 잭슨/샬토 코플리', '2021-06-10', 15, 119, '줄거리', 0.0, 'https://youtu.be/exyzEFrmLuM', '1-9.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '존 윅3: 파라벨룸', '액션', '채드 스타헬스키', '미국', '키아누 리브스/할리 베리/이안 맥쉐인/로렌스 피시번/안젤리카 휴스턴', '2019-06-26', 20, 131, '줄거리', 0.0, 'https://youtu.be/M7XM597XO94', '1-10.jpg', null);

 -- 2. 판타지
 
 INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL,'신과함께 - 인과 연', '판타지', '김용화', '한국', '하정우/주지훈/김향기/마동석/김동욱', '2018-08-01', 12, 141, '줄거리', 0.0,'https://www.youtube.com/watch?v=amXcMw8cJZk', '2-1.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL,'신과함께 - 죄와 벌', '판타지', '김용화', '한국', '하정우/차태현/주지훈/김향기/김동욱', '2017-12-20', 12, 139, '줄거리', 0.0,'https://www.youtube.com/watch?v=5O5PVvHTWRo', '2-2.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL,'해리 포터와 마법사의 돌', '판타지', '크리스 콜럼버스', '영국', '다니엘 래드클리프/루퍼트 그린트/엠마 왓슨/로비 콜트레인/리처드 해리스', '2001-12-14', 0, 152, '줄거리', 0.0,'https://www.youtube.com/watch?v=dlSkyNLOncY', '2-3.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL,'호빗 - 뜻밖의 여정', '판타지', '피터 잭슨', '미국', '마틴 프리먼/이안 맥켈런/리처드 아미티지/케이트 블란쳇/올랜도 블룸', '2012-12-13', 12, 169, '줄거리', 0.0,'https://www.youtube.com/watch?v=_Ovlth7ScIc', '2-4.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL,'호빗 - 스마우그의 폐허', '판타지', '피터 잭슨', '미국', '마틴 프리먼/이안 맥켈런/리처드 아미티지/케이트 블란쳇/올랜도 블룸', '2013-12-12', 12, 161, '줄거리', 0.0,'https://www.youtube.com/watch?v=qkYzyLPrZh4', '2-5.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL,'호빗 - 다섯 군대 전투', '판타지', '피터 잭슨', '미국', '마틴 프리먼/이안 맥켈런/리처드 아미티지/케이트 블란쳇/올랜도 블룸', '2014-12-17', 12, 144, '줄거리', 0.0,'https://www.youtube.com/watch?v=taji0FUv1sk', '2-6.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL,'말레피센트 2', '판타지', '요아킴 뢰닝', '미국', '안젤리나 졸리/엘르 패닝/미셸 파이퍼/치웨텔 에지오포/샘 라일리', '2019-10-17', 12, 119, '줄거리', 0.0,'https://www.youtube.com/watch?v=DTzQJ1n8keI', '2-7.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL,'판의 미로 - 오필리아와 세 개의 열쇠', '판타지', '기예르모 델 토로', '미국', '이바나 바쿠에로/더그 존스/세르지 로페즈/아리아드나 길/마리벨 베르두', '2006-11-30', 15, 119, '줄거리', 0.0,'https://www.youtube.com/watch?v=07OiMghLXao', '2-8.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL,'찰리와 초콜릿 공장', '판타지', '팀 버튼', '미국', '조니 뎁/프레디 하이모어/데이빗 켈리/헬레나 본햄 카터/노아 테일러', '2005-09-16', 0, 114, '줄거리', 0.0,'https://www.youtube.com/watch?v=sWXwA9DPwK0', '2-9.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL,'나니아 연대기 - 사자, 마녀 그리고 옷장', '판타지', '앤드류 아담슨', '미국', '조지 헨리/윌리암 모즐리/스캔다 케인즈/안나 팝플웰/틸다 스윈튼', '2005-12-29', 0, 139, '줄거리', 0.0,'https://www.youtube.com/watch?v=xYbXI75IyI8', '2-10.jpg', null);

 -- 3.SF

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.nextval,'매트릭스', 'SF', '릴리 워쇼스키', '미국', '키아누 리브스/로렌스 피시번', '1999-05-15',12, 136,'서기 2199년', 0.0 ,'https://www.youtube.com/watch?v=9mn4seqI8Vs', '3-1.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.nextval,'그래비티', 'SF', '안폰소 쿠아론', '미국', '산드라 블록/조지 클루니/에드 해리스/오르토 이그나이티우센/팔두트 샤르마', '2013-10-17', 12, 90,'허블', 0.0,'https://www.youtube.com/watch?v=I9mbNcmGNQI','3-2.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.nextval,'베놈 2: 렛 데어 비 카니지', 'SF', '앤디 서키스', '미국', '톰 하디/미셸 윌리엄스/나오미 해리스/레이드 스콧/스테판 그레이엄', '2021-10-13', 15, 97, '베놈',0.0,'https://www.youtube.com/watch?v=V6aWnlhH6ug','3-3.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.nextval,'듄', 'SF', '드니 빌뇌브', '미국', '티모시 샬라메/레베카 퍼거슨/오스카 아이삭/제이슨 모모아/조슈 브롤린', '2021-10-20', 12, 155, '듄',0.0,'https://www.youtube.com/watch?v=VXjGcWq6VnM','3-4.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.nextval,'인터스텔라', 'SF', '크리스토퍼 놀란', '미국', '매튜 맥커너히/앤 해서웨이/마이클 케인/제시카 차스테인/케이시 애플렉', '2014-11-06', 12, 169, '우린',0.0,'https://www.youtube.com/watch?v=d2VN6NNa9BE','3-5.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.nextval,'스카이 라인: 더 비욘드', 'SF', '풀비오 세스티토', '미국', '마틴 센스마이어/피터 스토메어', '2018-11-25', 15, 82, '스카이',0.0,'https://www.youtube.com/watch?v=OGAGs__Vc-M','3-6.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.nextval,'베놈', 'SF', '류벤 플레셔', '미국', '톰 하디/미셸 윌리엄스/리즈 아메드/제니 슬레이트/레이드 스콧', '2018-10-03', 15, 107, '영웅악당',0.0,'https://www.youtube.com/watch?v=Gx2b-1f0DAc','3-7.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.nextval,'미드나이트 스카이', 'SF', '조지 클루니', '미국', '조지 클루니/펠리시티 존스/데이빗 오예로워/카일 챈들러/데미안 비쉬어', '2020-12-09', 12, 118, '?',0.0,'https://www.youtube.com/watch?v=FVR5-gH-vUQ','3-8.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.nextval,'더 시그널', 'SF', '윌리엄 유뱅크', '미국', '브렌튼 스웨이츠/로렌스 피시번/올리비아 쿡/뷰 크냅/린 사예', '2014-07-09', 12, 94, '그 신호',0.0,'https://www.youtube.com/watch?v=sf1biZUO50I','3-9.jpg', null);
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.nextval,'디스트릭트9', 'SF', '닐 블롬캠프', '미국', '샬토 코플리/바네사 헤이우드/제이슨 코프/데이빗 제임스/나탈리 볼트', '2009-10-15', 20, 112, '외계인 관람금지',0.0,'https://www.youtube.com/watch?v=DyLUwOcR5pk','3-10.jpg', null);

 -- 4. 코미디
 
 INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '화이트칙스', '코미디', '키넌 아이버리 웨이언스', '미국', '숀 웨이언스/마론 웨이언스/제이미 킹/프랭키 페이슨/로슬린 먼로', '2004-11-17' , 15, 108, '화이트칙스', 0.0, 'https://www.youtube.com/watch?v=ENFcNRUDFyE', '4-1.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '어쩌다 로맨스', '코미디', '토드 스트라우스-슐슨', '미국', '레벨 윌슨/리암 헴스워스/아담 드바인/프리앙카 초프라', '2019-02-13', 15, 89, '어쩌다로맨스', 0.0, 'https://www.youtube.com/watch?v=KavCjTYrLNo', '4-2.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '쿵푸허슬', '코미디', '주성치', '중국', '주성치/원화/원추/임자총/동지화', '2005-01-14' , 15, 101, '쿵푸허슬', 0.0, 'https://www.youtube.com/watch?v=0mR-4UFcz1w', '4-3.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '내 인생을 훔친 사랑스러운 도둑녀', '코미디', '세스 고든', '미국', '제이슨 베이트만/맬리사 맥카시/존 조/매기 엘리자베스 존스', '2013-01-01', 15, 112, '내인생을훔친사랑스러운도둑녀', 0.0, 'https://www.youtube.com/watch?v=OsodY9PcNy8', '4-4.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '17어게인', '코미디', '버 스티어스', '미국', '잭 에프론/레슬리 만스칼렛 오도넬/토마스 레논/매튜 페리/타일러 스틸맨', '2009-01-01', 12, 127, '세븐틴어게인', 0.0, 'https://www.youtube.com/watch?v=wiEdtg0IAX8', '4-5.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '배드맘스', '코미디', '존 루카스, 스캇 무어', '미국', '밀라 쿠니스/캐러신 한/크리스틴 벨', '2016-01-01', 20, 100, '배드맘스', 0.0, 'https://www.youtube.com/watch?v=iKCw-kqo3cs', '4-6.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '스트레스를 부르는 그 이름 직장상사', '코미디', '세스 고든', '미국', '제이슨 베이트먼/찰리 데이/제이슨 서데이키스/제니퍼 애니스턴', '2011-11-17', 20, 97, '스트레스를부르는그이름직장상사',0.0 , 'https://youtu.be/bU0STezaOyk', '4-7.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '섹스튜플리츠', '코미디', '마이클 티데스', '미국', '말론 웨이언스/브레샤 웹/마이클 이안 블랙/글린 터먼/데비 모건', '2019-08-16', 15, 98, '섹스튜플리츠', 0.0, 'https://www.youtube.com/watch?v=J0uBd9COJwI', '4-8.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '행오버', '코미디', '토드 필립스', '미국', '브래들리 쿠퍼/에드 헬름스/자흐 갈리피아나키스/헤더 그레이', '2009-01-01', 20, 100, '행오버', 0.0, 'https://www.youtube.com/watch?v=tcXIbsDWi04', '4-9.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '위아더밀러스', '코미디', '로슨 마샬 터버', '미국', '제니퍼 애니 스톤/엠마 로버츠/제이슨 서디키스/윌 폴터', '2013-08-07', 20, 110, '위아더밀러스', 0.0, 'https://www.youtube.com/watch?v=ilUftIawlqU', '4-10.jpg', null);
 
 
 -- 5. 로맨스
 
 INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '타이타닉', '로맨스', '제임스 카메론', '미국', '레오나르도 디카프리오/ 케이트 윈슬렛/ 빌리 제인/ 케시 베이츠/ 프란시스 피셔/ 글로리아 스튜어트', '1998-02-20' , 15, 194, 'DD', 0.0, 'https://www.youtube.com/watch?v=ioGnbnIAlJk', '5-1.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '어바웃타임', '로맨스', '리차드 커티스', '영국', '도널 글리슨/ 레이첼 맥아담스/ 빌 나이/ 린제이 던칸/ 리디아 윌슨', '2013-12-05', 15, 123, 'A', 0.0, 'https://www.youtube.com/watch?v=tnyWkyDGWuM', '5-2.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '이프온리', '로맨스', '길 정거', '미국', '제니퍼 러브 휴잇/ 폴 니콜스/ 톰 윌킨슨/ 루시 대븐포트/ 다이아나 하드캐슬', '2004-10-29' , 15, 96, 'A', 0.0, 'https://www.youtube.com/watch?v=40Ahmsbae94', '5-3.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '이터널 션샤인', '로맨스', '미셸 공드리', '미국', '짐 캐리/ 케이트 윈슬렛/ 커스틴 던스트/ 마크 러팔로/ 일라이저 우드/ 톰윌킨스', '2005-11-10', 15, 107, 'A', 0.0, 'https://www.youtube.com/watch?v=qmth-PGDD0Q', '5-4.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '뷰티인사이드', '로맨스', '백종열', '한국', '한효주/ 김대명/ 도지한/ 배성우/ 박신혜', '2015-08-20', 12, 127, 'A', 0.0, 'https://www.youtube.com/watch?v=ESPFTY8Y-xM', '5-5.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '클래식', '로맨스', '곽재용', '한국', '손예진/ 조승우/ 조인성/ 이기우/ 서영희', '2003-01-30', 12, 132, 'A', 0.0, 'https://www.youtube.com/watch?v=Jb1eMxccojs', '5-6.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '벤자민버튼의 시간은 거꾸로 간다', '로맨스', '데이빗 핀처', '미국', '브래드 피트/ 케이트 블란쳇/ 줄리아 오몬드/ 타라지 P.헨슨/ 폰느 A.챔버스', '2009-02-12', 12, 166, 'A',0.0 , 'https://www.youtube.com/watch?v=wG9G4zVyAME', '5-7.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '봄날은 간다', '로맨스', '허진호', '한국', '유지태/ 이영애/ 백성희/ 박인환/ 신신애', '2001-09-28', 15, 106, 'A', 0.0, 'https://www.youtube.com/watch?v=7jJ-MbRfe7M', '5-8.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '블루 발렌타인', '로맨스', '데릭 시엔프랜스', '미국', '라이언 고슬링/ 미쉘 월리엄스/ 페이스 라디카/ 존 도먼/ 마이클 보겔', '2012-05-31', 20, 114, 'A', 0.0, 'https://www.youtube.com/watch?v=ElzLFrx1Ibo', '5-9.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '티파니에서 아침을', '로맨스', '블레이크 에드워즈', '미국', '오드리 헵번/ 조지 페파드/ 페트리샤 닐/ 미키 루니', '1962-10-01', 15, 115, 'A', 0.0, 'https://www.youtube.com/watch?v=t0vpWhby3WM', '5-10.jpg', null);

 -- 6. 스릴러/호러
 
INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '데이비드 게일', '스릴러', '앨런 파커', '미국', '케빈 스페이시/케이트 윈슬렛/로라 린니/가브리엘 만/맷 크레이븐/레온 리피','2003-03-21',15,130,'데이비드 게일',0.0,'https://youtu.be/7m2U1RqTN2A','6-1.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '유전', '스릴러', '아리 애스터', '미국','토니 콜렛/밀리 샤피로/가브리엘 번/알렉스 울프/앤 도드','2018-06-07',20,127,'유전',0.0, 'https://www.youtube.com/watch?v=w3id0NA161o', '6-2.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '아이덴티티','스릴러','제임스 맨골드','미국','존 쿠삭/레이 리오타/아만다 피트/존 호키스/알프리드 몰리나','2003-10-31',15,90,'아이덴티티',0.0, 'https://www.youtube.com/watch?v=LkAC4u8inU0','6-3.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '엑소시즘 오브 에밀리로즈', '스릴러', '스콧 데릭슨', '미국', '로라 리니/톰 윌킨슨/캠벨 스코트/제니퍼 카펜터/콜므 포어','2006-04-13',15,119,'에밀리로즈',0.0,'https://www.youtube.com/watch?v=9fmMWedEaCs','6-4.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '트라이앵글', '스릴러', '크리스토퍼 스미스', '영국', '멜리사 조지/리암 햄스워스/마이클 도어맨/라챠엘 카파니/엠마 렁','2018-08-29',15,99,'트라이앵글',0.0,'https://www.youtube.com/watch?v=wMwkbXXJ-xo','6-5.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '버드박스', '스릴러', '수잔 비에르', '미국', '산드라 블록/트래반트 로즈/존 말코비치/사라 폴슨/재키 위버','2018-11-12',15,124,'버드박스',0.0,'https://www.youtube.com/watch?v=Hin0ED-NJAs','6-6.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '퍼펙션','스릴러','리처드 쉐퍼드', '미국','앨리슨 윌리암스/로건 브라우닝/스티븐 웨버/글리니스 데이비스/그레이엄 더피','2019-05-24',20,90,'퍼펙션',0.0,'https://www.youtube.com/watch?v=3NBr5LdlLzI','6-7.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '샤이닝', '스릴러', '스탠리 큐브릭', '영국', '잭 니콜슨/셜리 듀발/대니 로이드/스캣맨 크로더스/베리 넬슨','1980-05-23',20,144,'샤이닝',0.0, 'https://www.youtube.com/watch?v=4bOgjhR_NK4','6-8.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '컨저링', '스릴러', '제임스 완', '미국', '베라 파미가/패트릭 윌슨/릴리 테일러/론 리빙스턴/조이 킹','2013-09-17',15,112,'컨저링',0.0,'https://www.youtube.com/watch?v=dji5vHuoVtM','6-9.jpg', null);

INSERT INTO MOVIE
VALUES(SEQ_MOVIE.NEXTVAL, '에이리언', '스릴러', '리들리 스콧', '미국', '톰 스커릿/시고니 위버/베로니카 캣라이트/존 허트/해리 딘 스탠튼','1987-10-01',15,117,'에이리언',0.0,'https://www.youtube.com/watch?v=DNDyiZ-0Xi0','6-10.jpg', null);

-- 1.액션/ 2.판타지 /3.SF /4.코미디/ 5.로맨스 /6.스릴러&호러


CREATE TABLE MOVIE(
    SEQ_MOVIE	NUMBER(3,0) PRIMARY KEY,
    TITLE	VARCHAR2(100 BYTE) NOT NULL,
    GENRE	VARCHAR2(20 BYTE) NOT NULL,
    DIRECTOR	VARCHAR2(50 BYTE) NOT NULL,
    COUNTRY	VARCHAR2(20 BYTE) NOT NULL,
    ACTOR	VARCHAR2(500 BYTE) NOT NULL,
    CREATED	DATE,
    AGE	NUMBER(2,0) NOT NULL,
    RUNNINGTIME	NUMBER(3,0) NOT NULL,
    STORY	VARCHAR2(2000 BYTE) NOT NULL,
    RATE	NUMBER(2,1) NOT NULL,
    TRAILER	VARCHAR2(50 BYTE),
    POSTER	VARCHAR2(50 BYTE),
    POSTER2	VARCHAR2(50 BYTE)
);

CREATE TABLE MEMBER(
    SEQ_MEMBER	NUMBER(10,0) PRIMARY KEY,
    ID	VARCHAR2(50 BYTE) UNIQUE NOT NULL,
    PWD	VARCHAR2(60 BYTE) NOT NULL,
    NAME	VARCHAR2(50 BYTE) NOT NULL,
    EMAIL	VARCHAR2(150 BYTE) UNIQUE NOT NULL,
    NICKNAME	VARCHAR2(50 BYTE) UNIQUE NOT NULL,
    CREATEDATE	DATE,
    PROFILE	NUMBER(38,0) NOT NULL,
    PROFILE2	NUMBER(38,0) NOT NULL
);


--로그인용 유저 ID 추가
INSERT INTO MEMBER
VALUES(SEQ_MEMBER.NEXTVAL,'aaa','111','홍길동','aaa@naver.com','길동이동동',SYSDATE,1,1);

INSERT INTO MEMBER
VALUES(SEQ_MEMBER.NEXTVAL,'bbb','222','박길동','bbb@naver.com','발이동동',SYSDATE,1,1);


CREATE TABLE FAVORITEMOVIE(
    SEQ_FM NUMBER(10) PRIMARY KEY,
    LISTNUMBER NUMBER(10) NOT NULL,
    SEQ_USER NUMBER(10) NOT NULL,
    POSTER VARCHAR2(50) NOT NULL,
    CONSTRAINT FK_SEQ_USER FOREIGN KEY(SEQ_USER) REFERENCES MEMBER(SEQ_MEMBER)
);

CREATE TABLE FAVORITEGENRE(
    SEQ_FG NUMBER(10) PRIMARY KEY,
    SEQ_USER NUMBER(10) NOT NULL,
    ACTION INTEGER NOT NULL,
    FANTASY INTEGER NOT NULL,
    SF INTEGER NOT NULL,
    COMEDY INTEGER NOT NULL,
    ROMANCE INTEGER NOT NULL,
    THRILLER INTEGER NOT NULL,
    CONSTRAINT FK_SEQ_USER2 FOREIGN KEY(SEQ_USER) REFERENCES MEMBER(SEQ_MEMBER)
);

CREATE TABLE COMMENTS(
    SEQ_COMMENT NUMBER(10) PRIMARY KEY,
    ID VARCHAR2(50) NOT NULL,
    CONTENT VARCHAR2(2000) NOT NULL,
    CREATED DATE,
    RATE INTEGER NOT NULL,
    SEQ_MOVIE NUMBER(10) NOT NULL,
    CONSTRAINT FK_SEQ_COMMENT FOREIGN KEY(SEQ_MOVIE) REFERENCES MOVIE(SEQ_MOVIE)
);

CREATE TABLE REQUEST(
    SEQ_REQUEST NUMBER(10) PRIMARY KEY,
    ID VARCHAR2(50) NOT NULL,
    TITLE VARCHAR2(100) NOT NULL,
    CONTENT VARCHAR2(2000) NOT NULL,
    CREATED DATE
);

INSERT INTO REQUEST
VALUES(SEQ_REQUEST.NEXTVAL,'aaa','바람과 함께 사라지다','추가해주세요.',SYSDATE);

INSERT INTO REQUEST
VALUES(SEQ_REQUEST.NEXTVAL,'aaa','랍스터','이거 추가해주세요.',SYSDATE);

INSERT INTO REQUEST
VALUES(SEQ_REQUEST.NEXTVAL,'aaa','힐빌리의 노래','좋은 영화입니다..',SYSDATE);


COMMIT;


```


---
### 절차대로 테이블을 생성하였다면 웹페이지에 접속이 가능합니다. 아래의 계정으로 로그인 하시면 됩니다.
>ID:aaa 
>PW:111
