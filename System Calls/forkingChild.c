#Fork a child

#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main()
{
    pid_t p;
    printf("Before fork: \n");

    p = fork();

    if (p == 0)
    {
        printf("I am a child process having id: %d\n", getpid());
        printf("My parent process's id is: %d\n", getppid());
    }
    else
    {
        wait(NULL);
        printf("My child process's id is: %d\n", p);
        printf("I am a parent process having id: %d\n", getpid());
    }

    printf("Common\n");
    return 0;
}