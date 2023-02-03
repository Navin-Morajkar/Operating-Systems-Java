# dir operations

while true
do
    echo "1.Create directory";
    echo "2.Delete directory";
    echo "3.Change directory";
    echo "4.Current working directory";
    echo "5.Exit";
    echo "Enter your choice: ";

    read ch;

    case $ch in
        1)
        echo "Enter directory name: ";
        read dir
        if [ -d "$dir" ]; then 
            echo "Directory already exists";
        else
            mkdir $dir
        echo "Directory created";
        ls -t | head -n 15
        fi 
        ;; 

        2)
        echo "Enter directory name: ";
        read dir
        rmdir $dir
        echo "Directory deleted";
        ls -t | head -n 15
        ;;

        3)
        echo "Changing cwd to : (enter path): ";
        read path
        cd $path
        pwd
        ls -i
        ;;

        4)
        echo "Present working directory: ";
        pwd
        ;;

        5)
        exit;
        ;;

    esac
done