#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include<stdlib.h>
int main()
{
	int i, a[9], max = 0;
	max = a[0];
	scanf_s("%d", &i);
	for (i = 0; i < 10; i++)
	{
		if (a[i]>a[0])
			max = a[i];
	}
	printf("%d", max);
	system("pause");
}