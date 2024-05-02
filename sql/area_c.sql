set serveroutput on
declare
area number(6,2);
pi constant number(3,2) := 3.14;
radius number(5);
begin
radius := &radius;
area := pi*power(radius,2);
dbms_output.put_line(area);
end;
/  