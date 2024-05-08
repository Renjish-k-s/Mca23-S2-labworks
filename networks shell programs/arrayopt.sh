array=(1 2 3 4 5 6)
echo ${array[@]}
echo enter the position to pop
read num
unset 'array[$num]'
echo ${array[@]}