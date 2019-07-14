 #define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<assert.h>
int My_strcmp(char const*s1, char const *s2)//const修饰*表示s1和s2所指的字符串不能被修改
{
	assert(s1 != NULL);//断言s1所指不为空
	assert(s2 != NULL);
	int ret = 0;
	while (!(ret = (*s1 - *s2)) && *s1)//s1和s2所指的目标相等并且*s1不等于\0
	{
		s1++;
		s2++;
	}
	if (ret < 0)
	{
		return -1;
	}
	else if (ret>0)
	{
		return 1;
	}
	return ret;
}
int main()
{
	char str1[] = "agcde";
	char str2[] = "afcde";
	int ret = (My_strcmp(str1, str2));
	if (-1 == ret)
	{
		printf("str2大\n");
	}
	else if (1 == ret)
	{
		printf("str1大\n");
	}
	else printf("str1和str2一样大\n");
	system("pause");
	return 0;
}
