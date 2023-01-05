# 📖 Paradigma de Programação Orientado a Objetos (POO)

- O paradigma da POO(Programação Orientada a Objetos) é um modelo de análise, projeto e programação baseado na aproximação entre o mundo real e o mundo virtual, através da criação e interação entre objetos, atributos, códigos, métodos, entre outros. São 4 os pilares principais do POO: ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIMORFISMO.

### ⚡ Abstração:
  Em suma é a abstração/captura das principais caracteristicas dos itens do contexto de forma que eles possam ser facilmente descritos em uma classe, que gerará objeto. 

### ⚡ Encapsulamento:
  Encapsular os dados de uma aplicação significa evitar que estes sofram acessos indevidos. Para isso, é criada uma estrutura que contém métodos que podem ser utilizados por qualquer outra classe, sem causar inconsistências no desenvolvimento de um código. (EX: private, public, protected)

### ⚡ Herança:
 Permite criar novas classes a partir de classes já existentes (herdar da classe pai), aproveitando-se das características existentes na classe a ser estendida. Este mecanismo é muito interessante, pois promove um grande reuso e reaproveitamento de código existente. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada. (EX: class Carro extends Automovel)
  
### ⚡ Polimorfismo:
É o princípio pelo qual duas ou mais classes derivadas  de uma única classe podem invocar métodos que têm a mesma assinatura, mas comportamentos distintos. O Polimorfismo é um mecanismo por meio do qual selecionamos as funcionalidades utilizadas de forma dinâmica por um programa no decorrer de sua execução. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.


# 📖 Conceitos fundamentais do POO

### ⚡ Sobrescrita:
  O ato de sobrescrever um método ou propriedade significa dar uma nova forma ao mesmo, uma nova versão. Quando um método sobrescreve um método herdado de uma classe, temos uma sobrescrita de método. Este método de sobrescrita tem que ser idêntico ao método da classe herdada, ou seja, eles precisam ter o mesmo nome, valor de retorno e argumentos. Portanto, temos que uma classe filha fornece apenas uma nova implementação para o método herdado e não um novo método.

### ⚡ Sobrecarga:
  Sobrecarga permite a existência de vários métodos de mesmo nome, porém com assinaturas levemente diferentes, ou seja, variando no número e tipo de argumentos. Ficaria a cargo do compilador escolher de acordo com as listas de argumentos os procedimentos ou métodos a serem executados.

### ⚡ Instância: 
  Uma instância de uma classe é um novo objeto criado dessa classe, com o operador new. Instanciar uma classe é criar um novo objeto do mesmo tipo dessa classe. Uma classe somente poderá ser utilizada após ser instanciada.

### ⚡ forEach():
   O método forEach() executará uma função para cada elemento presente em um array.
``public class ExemploForEach {

    public static void main(String[] args) {

        List<Integer> itens = Arrays.asList(15, 11, 13, 9, 35);

    itens.forEach(System.out::println);
    }}

### ⚡ Map():
  O map() executa uma função de transformação em todos os elementos de uma determinada lista , e retorna uma nova lista como resultado.
  `[50, 60, 70].map(value => value * 1.1)
// [55, 66, 77]`

By: **sıɥɹƆ sıɥɹƆ**
