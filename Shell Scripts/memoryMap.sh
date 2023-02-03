# memory map, process info, terminal devices

while true 
do
    echo "1.Display all Terminal Devices";
    echo "2.Display Memory Map";
    echo "3.Display Processor Info";
    echo "4.Exit";
    echo "Enter your choice: ";
    read ch;

    case $ch in
        1)
        echo "All Terminal Devices: ";
        lspci
        ;;

        2)
        echo "Memory Map: ";
        free -m     # or use: less/proc/meminfo
        ;;

        3)
        echo "Process Information: ";
        cat /proc/cpuinfo
        ;;

        4)
        exit;
        ;;

    esac
done