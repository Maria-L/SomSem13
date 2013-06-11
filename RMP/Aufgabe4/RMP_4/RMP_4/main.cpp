#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "stringsort.h"


int main(int argc)
{
	char *pMS[] = {
					"Haller       25 EUR",
					"Kandinsky    13 EUR",
					"Brombach      5 EUR",
					"Zaluskowski 120 EUR",
					"Osman        17 EUR",
					"\0\0"
	};

	sortiereStrings(pMS);
	printStringListe(pMS);
	system("pause");
	return 0;
}
