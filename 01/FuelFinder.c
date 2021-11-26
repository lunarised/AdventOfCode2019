#include <stdio.h>
#include <stdlib.h>

int findFuel(int _mass){
    int mass = _mass;
    return ((mass/3) - 2);
}
int main(){
    int sum = 0;
    char buffer[255];
    FILE *fp;
    size_t len = 0;
    ssize_t read;
    char *line = NULL;
    fp = fopen("./input.txt", "r");
    
    while ((read = getline(&line, &len, fp )) != -1){
        sum = sum + findFuel(atoi(line));
    }
    printf("%d", sum);
    return 0;
}