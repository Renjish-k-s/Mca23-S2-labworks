echo -e "enter the command\n"
echo -e "add\nsub\ndiv\nmul"
read com
echo "enter the 1 st number"
read num1
echo enter the 2 nd number
read num2

case $com in
	add) sum=$((num1+num2))
	     echo sum=$sum
	;;
	sub) diff=$((num1-num2))
             echo difference=$diff
        ;;
	div) if [num2 -eq 0 ]; then 
		     echo Error:zero division
	     else
		     div=$(echo "scale=2; $num1/$num2" | bc)
		     echo division $div
	fi
        ;;

esac

