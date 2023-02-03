// loggedin users
#include <stdio.h>
#include <sys/utsname.h>
#include <utmp.h>
#include <time.h>

int main()
{
    struct utmp *n;
    int c = 0;
    setutent();
    n = getutent();
    while (n != NULL)
    {
        if (n->ut_type == 7)
            c++;
        n = getutent();
    }
    setutent();
    n = getutent();
    printf("Number of logged in users= %d\n\n", c);
    while (n != NULL)
    {
        if (n->ut_type == 7)
        {
            printf("%s", n->ut_user);
            printf("%s", n->ut_line);
            printf("%s", n->ut_host);
            time_t t;
            t = n->ut_time;
            printf("%s\n", ctime(&t));
        }
        n = getutent();
    }
    return 0;
}