# WEB
WEB(Java Project로 생성)
- Java Project에는 기본적으로 src(.java), bin(.class)가 존재한다.
- Dynamic WEB Project의 디렉토리 구조로 변경 : 아래와 같은 Directory 구조가 되어야 WAS(tompcat)이 WEB Application으로 인식한다.
   - Dynaminc WEB Project에서는 classes에 .class파일들이 존재. 
- WEB
  - src 
  - webapp(root directory)
       - **WEB-INF**
          - lib : api(.jar)
          - classes : .class
          - web.xml : 배치서술자(deployment descriptor), mapping 할 때 사용.
       - member
       - js
       - images
       - css 

- Tomcat과 연결하기 위해 server.xml에 context등록
   - Context path="/web" docBase="C:\eGovFrame-3.9.0\workspace.edu\WEB\webapp"
