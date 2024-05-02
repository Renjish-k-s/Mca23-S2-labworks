set serveroutput on;

create or replace function getstring()
return varchar is
    string varchar(100);
begin 
    string:='dsgbhfd';
    return string;  
end getstring;
/   

declare
result_string varchar(100);
begin
result_string:=getstring();
dbms_output.put_line(result_string);
end;
/
