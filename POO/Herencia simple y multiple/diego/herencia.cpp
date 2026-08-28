#include <iostream>
using namespace std;

class Animal{
    public:
        string nombre;

        Animal(string nombre): nombre(nombre){
            cout << "Animal constructor" << endl;
        };
        
        
        void virtual andar(){
            cout << nombre << " esta andando" << endl;
        }
};

class Perro : public Animal{
    public:
    Perro(string nombre) : Animal(nombre){};

    void ladrar(){
        cout << nombre << " "<< "esta ladrando" << endl;
    }

    void andar(){
        cout << nombre << " " << "esta corriendo" << endl;
    }
};

class Volador : virtual public Animal{
    public:
    Volador(string nombre) : Animal(nombre){}
        void volar(){
            cout << nombre << " esta volando" << endl;
        }
};

class Nadador : virtual public Animal{
    public:
    Nadador(string nombre) : Animal(nombre){}
        void nadar(){
            cout << nombre << " esta nadando" << endl;
        }
};

class Pato : public Volador, public Nadador{
    public: 
        Pato(string nombre) : Nadador(nombre) , Volador(nombre) , Animal(nombre) {}
        void graznar(){
            cout << nombre << " esta graznando" << endl;
        }

};

int main(){
    Perro perro1("pako");
    perro1.ladrar();
    perro1.andar();

    Pato pato1("claudia");
    pato1.graznar();
    pato1.andar();

    Volador volador1("aaaaa");
    volador1.volar();

    Nadador nadador1("glu glu");
    nadador1.nadar();

    return 0;
}