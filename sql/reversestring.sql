set serveroutput on

create or replace function reversestring(word in varchar2)
return varchar2 is
rev_word varchar2(10);
begin
for i in reverse 1..length(word)
loop
rev_word:=rev_word||substr(word,i,1);
end loop;

return rev_word;
end reversestring;
/

declare 
checkstr varchar2(20);
begin
checkstr:='&checkstr';
if checkstr = reversestring(checkstr)
then
dbms_output.put_line('palindrome');
else
dbms_output.put_line('not');
end if;
end;
/


