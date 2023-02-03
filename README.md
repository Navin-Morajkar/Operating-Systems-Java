# Operating System Experiments (Java)

This repository contains the code for experiments performed in the Operating Systems course at our college. These experiments were a part of our curriculum and are intended to provide a hands-on experience of the various concepts and algorithms in Operating Systems.

## Content

The repository includes the following experiments:

1. CPU Scheduling Algorithms 
* [FCFS (Non-Preemptive)](https://github.com/Navin-Morajkar/Java/blob/master/FCFS/src/fcfs/FCFS.java)
+ [Shortest Job First (Non-Preemptive)](https://github.com/Navin-Morajkar/Java/blob/master/NPSJF/src/npsjf/NPSJF.java)
- [Shortest Job First (Preemptive) / Shortest Remaining Time First (SRTF)](https://github.com/Navin-Morajkar/Java/blob/master/SJF/src/sjf/SJF.java)
* [Round Robin](https://github.com/Navin-Morajkar/Java/blob/master/RoundRobin/src/roundrobin/RoundRobin.java)

2. Implementation of Threads (Multithreading)
* [Using Thread Class](https://github.com/Navin-Morajkar/Java/blob/master/ThreadClass/src/threadclass/ThreadClass.java)
+ [Using Runnable Interface](https://github.com/Navin-Morajkar/Java/blob/master/MultiThreading/src/multithreading/MultiThreading.java)

3. [Process synchronization using semaphores (Dining Philosophers Problem)](https://github.com/Navin-Morajkar/Java/blob/master/DiningPhilosophers/src/diningphilosophers/DiningPhilosophers.java)

4. [Deadlock Avoidance using Banker's Algorithm](https://github.com/Navin-Morajkar/Java/blob/master/BankersAlgorithm/src/bankersalgorithm/BankersAlgorithm.java)

5. Page Replacement Algorithms 
- [FIFO](https://github.com/Navin-Morajkar/Java/blob/master/PageReplacement_FIFO/src/pagereplacement_fifo/PageReplacement_FIFO.java)
* [LRU](https://github.com/Navin-Morajkar/Java/blob/master/PageReplacement_LRU/src/pagereplacement_lru/PageReplacement_LRU.java)

6. Disk Scheduling Algorithms
+ [FCFS](https://github.com/Navin-Morajkar/Java/blob/master/DiskScheduling_FCFS/src/diskscheduling_fcfs/DiskScheduling_FCFS.java)
- [SSTF](https://github.com/Navin-Morajkar/Java/blob/master/DiskScheduling_SSTF/src/diskscheduling_sstf/DiskScheduling_SSTF.java)

7. Shell Scipts
- [Working on Users and Groups](https://github.com/Navin-Morajkar/Java/blob/master/Shell%20Scripts/usersGroups.sh)
+ [Implementations of Directory operations](https://github.com/Navin-Morajkar/Java/blob/master/Shell%20Scripts/directoryOperations.sh)
* [Display information of memory map and processor information](https://github.com/Navin-Morajkar/Java/blob/master/Shell%20Scripts/memoryMap.sh)
- [Process details and Changing process priorities](https://github.com/Navin-Morajkar/Java/blob/master/Shell%20Scripts/processDetails.sh)

8. System Calls
- [Forking of Child process](https://github.com/Navin-Morajkar/Java/blob/master/System%20Calls/forkingChild.c)
+ [List of logged in users](https://github.com/Navin-Morajkar/Java/blob/master/System%20Calls/AllLoggedInUsers.c)
- [List of all devices connected](https://github.com/Navin-Morajkar/Java/blob/master/System%20Calls/AllDevicesConnected.c)

## Requirements

The code is written in Java programming language and requires a java compiler to run.

## Usage

To run the code for a particular experiment, navigate to the .java file under src directory.

To implement System calls use the following commands in the terminal:
```
gcc filename.c -o outputfile
./outputfile
```

To implement Shell Script programs use the following commands in the terminal:
```
nano filename.sh
ls -l filename.sh
chmod +x filename.sh
./filename
```

1. First locate the directory where the file is saved
2. Check if the .sh has the required permissions to execute using the 'ls -l filename.sh' command
3. Use 'chmod +x filename.sh' to make the shell script executable 
4. Run the shell script program using ./filename

## Contributing

If you find any bugs or have any suggestions for improvements, feel free to create an issue or make a pull request.

## Disclaimer

These experiments were performed as a part of our academic curriculum and are intended for educational purposes only. The code and its implementation may not reflect real-world scenarios and should not be used in production systems.
