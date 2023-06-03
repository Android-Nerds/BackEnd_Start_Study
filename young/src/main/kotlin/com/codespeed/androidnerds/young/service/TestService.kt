package com.codespeed.androidnerds.young.service

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class TestService {
    fun testService(): String {
        return "Hello, World! This is Service"
    } // End ot testService

    /*
        MVC 구조 (순서)
        화면을 구성하는 거는 안드로이드
        View는 없고 Model이랑 Controller만 있음

        Controller 쪽에서는 외부에서 요청을 받아서
        Serivce 쪽에서 로직을 처리하고 다시 컨트롤러에서 받아서
        다시 데이터를 최종적으로 클라한테 보내줌

        아 그래서 컨트롤러에서는 복잡한 로직이 안들어가고
        대부분은 서비스에서 구현함

        DB접속을 해야되는데 (정적, 동적 ->DB)
        우리는 Mybatis 대신에 JPA를 사용함

        이해하기 쉽게 설명하자면 JPA는 안드에서 ROOM이랑 같은
        인터페이스 개념임

        MyBatis는 SQL Query를 직접 작성하지만,
        JPA는 예약된 메소드를 사용함 -> CRUD를 메소드로 처리함
        그래서 쿼리를 직접 작성할 일이 거의 없은
        복잡한 쿼리문 작성에서는 QueryDSL을 사용할 예정임

        JPA에서는 Entity라는 개념이 필요함
        테이블을 객체화 시킨거임

        멤버 테이블이 있으면 member Entity를 만들거임
        각 테이블 마다 엔티티를 만듬

        1:1로 대응되는 걸 만듬
        각 엔티티에는 각 컬럼들을 멤버 변수로 엔티티에 만들어줄거임

        JOIN조건 같은거를 엔티티에 적어준다고 함(기록)
        엔티티 말고 제어, 할때
        SELECT UPDATE... 할 때,

        Repository라는 걸 만들어줄거임
        기본적으로 만들어진 레포가 있음

        Ex) -> findAll, findById,
        SELECT을 위한 예약어임

        UPDATE, INSERT는 Repo객체를 만들고
        .save() 라는 메소드를 호출하면됨
        괄호 안에 엔티티 객체를 넣으면 됨,

        그 객체가 똑같은게 없으면 INSERT
        객체가 있으면 UPDATE함.
        
        .delete() 라는 메소드를 부르면,
        ()안에 엔티티 객체를 넘으면 거기에 해당하는 내용이 삭제가 됨
        
        이런 방식으로 동작함
        
        ***그래서 각 테이블을 만들 때 엔티티랑 레포를 만들어야됨

     */

} // End of TestService
