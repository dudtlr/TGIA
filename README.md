# TGIA

[[프론트엔드 링크]](https://github.com/geonheeMin/TGIA-Front/0531-iPhone8)
[[백엔드 링크]](https://github.com/geonheeMin/TGIA-Back/main)
[[웹페이지 링크]](https://github.com/geonheeMin/TGIA-Web/master)
[[딥러닝 코드]](https://github.com/MKSonny/TGIA_DeepLearn/main)

프론트엔드 코드 실행 방법
-------------
1. cd TGIA-Front 로 리액트 네이티브 폴더로 이동
2. npm install 로 node_modules 설치
3. cd ios && pod install 로 ios 빌드 준비
4. cd .. 으로 프로젝트 디렉토리로 이동 후 npx react-native (run-ios 혹은 run-android) 로 시뮬레이터 실행

웹 코드 실행법
-------------
1. cd TGIA-Web 으로 리액트 관리자 웹페이지 폴더로 이동
2. npm install 로 node_modules 설치
3. npm start 로 실행


딥러닝 코드 실행법
-------------
1. 백엔드 코드의 application.yml 파일에서 경로를 아래처럼 다운받은 딥러닝 코드 위치로 수정합니다.
   deepLearnFile.dir: /Users/son/Downloads/yolov5-master/spring_sended/
2. detect_spring.py 파일에서 def send_data_to_spring(data):
    url = 'http://{내 ip 주소}:8080/send-data'
    로 수정합니다.
3. second_chance_detect.py에서의 send_data_to_spring 함수도 위처럼 수정합니다.
4. watch.py 코드에서 path 변수, path = "/Users/son/desktop/upload" 를 백엔드 application.yml에 설정된 file.dir 경로와 같게 설정합니다.
4. 터미널에 python watch.py 명령어 입력합니다.
