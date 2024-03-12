<img src="https://capsule-render.vercel.app/api?type=waving&color=BDBDC8&height=150&section=header" />

# 📝 SBB Shop 프로젝트
SBB Shop은 Spring Boot와 Thymeleaf를 사용하여 만들어진 온라인 쇼핑몰 프로젝트입니다.

## 주요 기능

- 상품 목록 및 상세 정보 표시
- 장바구니에 상품 추가 및 제거
- 주문 프로세스: 사용자가 상품을 선택하고 결제하는 기능
- 사용자 인증 및 권한 관리
- 관리자 패널: 상품, 주문 및 사용자 관리 등을 위한 관리자 인터페이스

### 🛒Shop 소개
> 게시판 이용 소스
> - Spring MVC 아키텍처를 사용하여 질문과 관련된 웹 애플리케이션을 구축하는 데  
> 필요한 컨트롤러(Controller)와 서비스(Service)를 정의
>
#### ✏질문등록
##### QuestionController:
> - 컨트롤러 클래스는 웹 요청을 처리하고, 비즈니스 로직을 호출하여 적절한 응답을 반환.
> - /question 경로를 기준으로 요청을 처리. 예를 들어 /question/list는 질문 목록을 조회하고,  
>   /question/detail/{id}는 특정 질문의 상세 정보를 조회
> - Spring의 @Controller 어노테이션을 사용하여 컨트롤러 클래스임을 표시
> - 각 메소드에는 Spring의 @GetMapping, @PostMapping 어노테이션을 사용하여  
>   해당 HTTP 메소드에 대한 요청을 처리
> - 사용자의 권한을 확인하기 위해 Spring Security의 @PreAuthorize 어노테이션을 사용
> <img width="85%" src="https://github.com/mzznzz/sbb-shop/assets/138216503/6f4d3769-c60f-4d33-8fbd-3533a6d0fa12"/>
>
##### QuestionService:
> - 각 메소드는 데이터베이스와의 트랜잭션 단위로 실행. 따라서 메소드마다 @Transactional 어노테이션을 사용
> - 질문 목록 조회, 질문 상세 정보 조회, 질문 생성, 수정, 삭제 등과 같은 메소드를 제공
> - 사용자의 요청에 따라 데이터베이스에서 정보를 조회하거나 업데이트하는 작업을 수행
> <img width="85%" src="https://github.com/mzznzz/sbb-shop/assets/138216503/987c0e39-2bff-4388-ab1c-864c618f54c7"/>
> <img width="85%" src="https://github.com/mzznzz/sbb-shop/assets/138216503/5b113232-fc06-40df-b713-8117d4e53d64"/>

##### 영상 시연:
> <img width="85%" src="https://github.com/mzznzz/sbb-shop/assets/138216503/cbb54feb-ecd9-4ae7-b484-6f79c22c2390"/>

#### 🔐로그인
##### SecurityConfig:
> - filterChain() 메서드는 ecurityFilterChain 빈을 정의하여 보안 필터 체인을 설정. HttpSecurity 객체를 매개변수로 받아 필요한 보안 구성을 수행
> - authorizeHttpRequests() 메서드는 HTTP 요청에 대한 권한 설정을 정의하고, formLogin() 메서드는 폼 로그인 구성을 지정하며, logout() 메서드는 로그아웃 구성을 지정
> <img width="85%" src="https://github.com/mzznzz/sbb-shop/assets/138216503/438dc31b-0d8b-4eb9-8e9f-ebfbfe179913"/>
>
> - passwordEncoder() 메서드는 비밀번호 인코더를 빈으로 등록. Spring Security에서는 비밀번호를 안전하게 저장하기 위해 비밀번호를 해시하여 저장
> - BCryptPasswordEncoder를 사용하여 비밀번호를 안전하게 해시하는 빈을 등록
> <img width="85%" src="https://github.com/mzznzz/sbb-shop/assets/138216503/7c9f1b21-787d-4e3e-9979-81694ed044f4"/>

## 사용 기술
![html](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white) 
![css](https://img.shields.io/badge/CSS-239120?&style=for-the-badge&logo=css3&logoColor=white) 
<img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=white" />    
<img src="https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white" />
<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" />  
- Spring Boot: 애플리케이션의 설정, 보안 및 개발을 위한 프레임워크로 사용됨.
- Thymeleaf: 서버 측 템플릿 엔진으로 사용자 인터페이스를 생성하기 위해 사용됨.
- Spring Security: 사용자 인증 및 권한 관리를 위한 스프링 모듈.
- Spring Data JPA: 데이터 액세스 계층을 관리하기 위해 사용됨.
- MySQL: 영구적인 데이터 저장소로 사용되는 관계형 데이터베이스 시스템.
- Maven 또는 Gradle: 의존성 관리와 빌드를 위해 사용됨.

## 사용법

1. 프로젝트를 로컬 환경에 복제합니다.
2. MySQL 데이터베이스를 설정하고 스키마를 생성합니다.
3. 프로젝트를 빌드하고 실행합니다.
4. 웹 브라우저를 사용하여 애플리케이션에 접속하여 기능을 확인합니다.

## 기여 및 라이센스

- 이 프로젝트는 오픈 소스로 제공되며 GitHub에서 관리됩니다.
- 기여자들은 이슈를 제출하거나 풀 리퀘스트를 통해 프로젝트에 기여할 수 있습니다.
- 프로젝트에 대한 라이센스 정보가 README.md 파일에 제공되어야 합니다.



  









<img src="https://capsule-render.vercel.app/api?type=waving&color=BDBDC8&height=150&section=footer" />
