# PADRÃO DE PROJETO COMMAND 👨‍💻

## COMMAND
Command é um padrão de projeto comportamental que encapsula solicitações ou simples operações em objetos independentes.
Este design permite diferentes parametrizações de objetos, enfileirar, registrar o histórico e até operações de desfazer.

### Sua estrutura consiste em:
* Interface Command com o método para executar a ação (ou de desfazer a ação);
* Comandos concretos que implementarão a interface Command como LuzSmart ou ArCondicionadoSmart;
* O cliente que inicia a solicitação específica, como App que instancia o objeto Alexa;
* O receptor que conhece como executar a operação, como a Alexa;
* O Invoker que seria o método que executa o comando, solicitando ao objeto concreto de Command.

## PROJETO
Este projeto demonstra um estado antes e depois do padrão. Antes do padrão, é evidente a dificuldade para a integração de novas funcionalidades à Alexa e o quão complexo seria sem a aplicação do design.
Com o Command, mostra com clareza a simplicidade de adicionar um novo comando e a flexibilidade de configuração de novos clientes, provendo alta flexibilidade e extensibilidade ao sistema.
