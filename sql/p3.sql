set serveroutput on
declare
    i number(2) :=1;
begin
    loop
        dbms_output.put_line(i);
        i:=i+1;
        if(i=4) then
            break;
        end if; 
end loop;
end;
/