package br.ufsm.csi.pp.factory;

// Interface que define a operação comum para os produtos
interface Product {
    void doSomething();
}

// Classe concreta que implementa a interface do produto
class ConcreteProduct implements Product {
    @Override
    public void doSomething() {
        System.out.println("Fazendo algo no ConcreteProduct");
    }
}

// Classe abstrata que define o Factory Method
abstract class Creator {
    // Método Factory Method que retorna um objeto Product
    public abstract Product createProduct();

    // Método que utiliza o objeto Product
    public void useProduct() {
        Product product = createProduct();
        product.doSomething();
    }
}

// Classe concreta que estende o Creator e implementa o Factory Method
class ConcreteCreator extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}

// Exemplo de uso
public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        creator.useProduct();
    }
}

