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
        int fuelRequired = findFuel(atoi(line));
        sum += fuelRequired;
        while (fuelRequired > 0){
            fuelRequired = findFuel(fuelRequired);
            if (fuelRequired > 0){
                sum += fuelRequired;
            }
        }
    }
    printf("%d", sum);
    return 0;
}