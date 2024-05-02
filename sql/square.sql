set serveroutput on

create or replace function square(num in number)
return number is
sq number;
begin
sq:=num*num;
return sq;
end square;
/

create table squaretable(id int,squ number);
declare
num number;
sq number;
begin
for i in 1..10
loop
sq:=square(i);
insert into squaretable values(i,sq);
end loop;
end;
/
select * from squaretable;
