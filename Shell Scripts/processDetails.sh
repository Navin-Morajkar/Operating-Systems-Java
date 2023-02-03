#process details

while true
do
    echo "1. View processes";
    echo "2. Change process priority";
    echo "3. Exit";
    echo "Enter choice";
    read ch

    case $ch in
        1)
            ps
        ;;
        2)
            echo "Enter process id";
            read pid
            echo "Enter new process priority";
            read newp
            renice $newp -p $pid
        ;;
        3)
            exit;
    esac
done