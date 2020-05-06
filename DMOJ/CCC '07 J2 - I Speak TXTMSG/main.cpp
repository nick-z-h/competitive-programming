#include <iostream>

int main()
{
    while (true)
    {
        std::string n;
        std::cin >> n;
        if (n == "CU")
        {
            std::cout << "see you"
                      << "\n";
        }
        else if (n == ":-)")
        {
            std::cout << "I'm happy"
                      << "\n";
        }
        else if (n == ":-(")
        {
            std::cout << "I'm unhappy"
                      << "\n";
        }
        else if (n == ";-)")
        {
            std::cout << "wink"
                      << "\n";
        }
        else if (n == ":-P")
        {
            std::cout << "stick out my tongue"
                      << "\n";
        }
        else if (n == "(~.~)")
        {
            std::cout << "sleepy"
                      << "\n";
        }
        else if (n == "TA")
        {
            std::cout << "totally awesome"
                      << "\n";
        }
        else if (n == "CCC")
        {
            std::cout << "Canadian Computing Competition"
                      << "\n";
        }
        else if (n == "CUZ")
        {
            std::cout << "because"
                      << "\n";
        }
        else if (n == "TY")
        {
            std::cout << "thank-you"
                      << "\n";
        }
        else if (n == "YW")
        {
            std::cout << "you're welcome"
                      << "\n";
        }
        else if (n == "TTYL")
        {
            std::cout << "talk to you later"
                      << "\n";
            break;
        }
        else
        {
            std::cout << n << "\n";
        }
    }
    return 0;
}