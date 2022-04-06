create table employee(  eid int primary key,
                        ename varchar2(100),
                        designation varchar2(30),
                        joining_date varchar2(30),
                        email_id varchar2(100),
                        mobile_number int,
                        gender varchar2(100),
                        status varchar2(100),
                        address varchar2(100),
                        city varchar2(100),
                        state varchar2(100),
                        country varchar2(100),
                        created_date varchar2(100),
                        created_by varchar2(100)
                        );
                 
 
create table project(  pid int primary key,
                        pname varchar2(100),
                        description varchar2(30),
                        client_name varchar2(30),
                        start_date varchar2(100),
                        end_date varchar2(100),
                        team_size int,
                        status varchar2(100)
                        );                        