CENTRO UNIVERSITÁRIO SENAC
Disciplina: Projeto Integrador II
DESENVOLVIMENTO ESTRUTURADO DE SISTEMAS
São Paulo
2022/23

CENTRO UNIVERSITÁRIO SENAC
Disciplina: Projeto Integrador II
Carlos Eduardo Soares Pedro
Denis Henrique de Paiva
Eduardo Dalhke Lopes
Guilherme Armagni Honorato
Leandro Alves dos Santos
Leonardo José Bruno
Matheus Jardim Coda

DESENVOLVIMENTO ESTRUTURADO DE SISTEMAS

Projeto Integrador II – Fase 1 apresentado ao Centro Universitário Senac, como exigência parcial para obtenção de aprovação na disciplina Projeto Integrador II, do curso de Tecnologia em Análise e Desenvolvimento de Sistemas.
Orientador: Prof. Gustavo Calixto

SUMÁRIO
1. Introdução e Objetivo do projeto integrador............................................................ 3
2. Casos de Uso......................................................................................................................... 4
3. Cenários...................................................................................................................... 5
   3.1. Caso de Uso: Cadastrar Pessoa Física................................................................. 5
   3.2. Caso de Uso: Cadastrar Pessoa Jurídica.............................................................. 6
   3.3. Caso de Uso: Professor......................................................................................... 7
4. Diagrama de Classes............................................................................................................. 8
5. REFERÊNCIAS........................................................................................................... 9

1. Introdução e Objetivo do projeto integrador
   Este projeto tem como objetivo desenvolver um sistema de gestão escolar para uma grande universidade, focado principalmente no cadastro de pessoas físicas e jurídicas. A universidade necessita de uma solução tecnológica eficiente e abrangente para gerenciar o cadastro de seus professores, alunos e fornecedores, otimizando os processos administrativos e garantindo uma gestão mais eficaz.
   O objetivo principal deste projeto é implementar um sistema de cadastro de pessoas físicas e jurídicas na universidade, abrangendo os diferentes atores envolvidos, como professores, alunos e fornecedores. O sistema visa simplificar e agilizar o processo de registro de informações, proporcionando uma base de dados centralizada e confiável.

e relacionam, haja visto a grande expansão da tecnologia dentro de atividades corriqueiras. Este relacionamento já anteriormente predatório passou a ser mais frio e distante, automatizado por portais e aplicações onde ou o prestador segue regras e regimentos acatando obrigatoriamente ou simplesmente não pode acessar. Motoristas de aplicativos, criadores de conteúdos, portais de notícias e demais prestadores de serviços freelancer, viram sua mão de obra tornar-se uma mercadoria consumida em grande escala sem contudo ser reconhecida formalmente. Horas extenuantes, falta de adequação às leis sobre o trabalho formal, a informalidade obrigatória sem direitos, sem auxílio e sem garantias, com turnos cansativos e situações degradantes formam o mosaico ao qual buscamos amenizar.
O produto que buscamos desenvolver é um auxiliar financeiro direcionado a este perfil de trabalho. Buscamos mudar pessoas, devolver ao trabalhador o poder que exerce sobre seu trabalho e que ele possa através da informação buscar melhores condições de vida.

2. Casos de Uso
   No contexto de um diagrama de casos de uso, um caso de uso representa uma funcionalidade ou uma ação específica que um sistema realiza para atender às necessidades dos atores envolvidos. Ele descreve uma interação entre o usuário (ator) e o sistema.
   No exemplo do diagrama de casos de uso para um sistema de gestão escolar que deve representar o cadastro de diferentes tipos de pessoas, temos os seguintes casos de uso:

2.1. Cadastrar Pessoa Física: Representa o caso de uso de cadastrar uma pessoa física no sistema. Pode se referir ao cadastro de um professor ou de um aluno.

2.2. Cadastrar Pessoa Jurídica: Representa o caso de uso de cadastrar uma pessoa jurídica no sistema. Nesse caso, refere-se ao cadastro de um fornecedor ou Professor.

2.3. Professor: Representa o caso de uso relacionado às funcionalidades do professor no sistema. Pode incluir ações como registrar notas, gerenciar atividades, entre outras atividades específicas ao papel de um professor.

2.4. Aluno: Representa o caso de uso relacionado às funcionalidades do aluno no sistema. Pode incluir ações como consultar notas, acessar conteúdos, entre outras atividades específicas ao papel de um aluno.

2.5. Fornecedor: Representa o caso de uso relacionado às funcionalidades do fornecedor no sistema. Pode incluir ações como fornecer produtos ou serviços, gerenciar pedidos, entre outras atividades específicas ao papel de um fornecedor.

O caso de uso "(Salvar dados de pessoas)" é uma subfunção implícita que faz parte de cada caso de uso de cadastro. Ele representa a ação de salvar as informações inseridas no sistema após o cadastro ser realizado.
Esses casos de uso definem as principais interações entre o usuário e o sistema no contexto do sistema de gestão escolar. Cada caso de uso descreve uma funcionalidade específica que contribui para a gestão e o funcionamento do sistema.

3. Cenários
   
3.1. Caso de Uso: Cadastrar Pessoa Física
Este caso de uso descreve o processo de cadastrar uma pessoa física no sistema de gestão escolar, que pode ser um professor ou um aluno.

Pré: O usuário está autenticado no sistema como um administrador.
Pós: A pessoa física é cadastrada no sistema de gestão escolar.

1. O usuário seleciona a opção de cadastrar pessoa física.
2. O sistema exibe um formulário de cadastro de pessoa física.
3. O usuário preenche os dados pessoais da pessoa física, incluindo nome, CPF, data de nascimento, endereço, entre outros.
4. O usuário seleciona se a pessoa física é um professor ou um aluno.
5. O usuário clica no botão "Salvar".
6. O sistema valida os dados preenchidos.
7. O sistema armazena as informações da pessoa física no banco de dados.
8. O sistema exibe uma mensagem de sucesso indicando que o cadastro foi realizado com sucesso.

Alternativo: Dados inválidos
No passo 6, se os dados preenchidos forem inválidos ou incompletos, o sistema exibe uma mensagem de erro indicando os campos que precisam ser corrigidos. O caso de uso retorna ao passo 3 para que o usuário possa corrigir as informações e tentar salvar novamente.

Alternativo: Cancelar o cadastro
No passo 5, o usuário decide cancelar o cadastro. O sistema retorna à tela principal sem salvar as informações e exibe uma mensagem informando que o cadastro foi cancelado.

3.2. Caso de Uso: Cadastrar Pessoa Jurídica
Este caso de uso descreve o processo de cadastrar uma pessoa jurídica no sistema de gestão escolar, referente a fornecedores.

Pré: O usuário está autenticado no sistema como um administrador.
Pós: A pessoa jurídica é cadastrada no sistema de gestão escolar.

1. O usuário seleciona a opção de cadastrar pessoa jurídica.
2. O sistema exibe um formulário de cadastro de pessoa jurídica.
3. O usuário preenche os dados da pessoa jurídica, incluindo razão social, CNPJ, endereço, entre outros.
4. O usuário clica no botão "Salvar".
5. O sistema valida os dados preenchidos.
6. O sistema armazena as informações da pessoa jurídica no banco de dados.
7. O sistema exibe uma mensagem de sucesso indicando que o cadastro foi realizado com sucesso.

Alternativo: Dados inválidos
No passo 5, se os dados preenchidos forem inválidos ou incompletos, o sistema exibe uma mensagem de erro indicando os campos que precisam ser corrigidos. O caso de uso retorna ao passo 3 para que o usuário possa corrigir as informações e tentar salvar novamente.

3.3. Caso de Uso: Cadastrar Professor
Ator Principal: Administrador do sistema

Fluxo Básico:
1. O Administrador do sistema inicia o caso de uso de cadastro de professor.
2. O sistema exibe o formulário de cadastro de professor.
3. O Administrador preenche as informações necessárias do professor, como nome, data de nascimento, endereço, telefone, e-mail, etc.
4. O Administrador seleciona a opção de salvar o cadastro.
5. O sistema valida os campos preenchidos pelo Administrador.
6. O sistema salva as informações do professor no banco de dados.
7. O sistema exibe uma mensagem de confirmação de sucesso do cadastro.
8. O caso de uso é encerrado.

Pré-condições:
- O Administrador do sistema está autenticado.
- O sistema de gestão escolar está em funcionamento.

Pós-condições:
- As informações do professor são armazenadas no banco de dados.
- O professor está registrado no sistema e pode acessar suas funcionalidades.

Cenários Alternativos:
- No passo 5, se algum campo obrigatório não for preenchido corretamente, o sistema exibe uma mensagem de erro informando ao Administrador que é necessário preencher os campos obrigatórios corretamente. O fluxo retorna ao passo 2 para permitir que o Administrador corrija as informações incorretas.
- No passo 6, se ocorrer algum erro no momento de salvar as informações do professor no banco de dados, o sistema exibe uma mensagem de erro ao Administrador, informando que o cadastro não pôde ser concluído. O fluxo é encerrado, e o Administrador pode tentar novamente mais tarde.
- No passo 7, se o Administrador optar por cancelar o cadastro antes de salvar as informações, o sistema exibe uma mensagem de confirmação perguntando se o Administrador realmente deseja cancelar o cadastro. Se confirmado, o fluxo é encerrado sem salvar as informações do professor no banco de dados.

4. Caso de Uso: Cadastramento de Fornecedor
   Ator Principal: Funcionário da Administração

Pré-condições:
- O funcionário da administração deve estar autenticado no sistema.
- O funcionário da administração deve ter as permissões necessárias para cadastrar fornecedores.

Fluxo Básico:
1. O funcionário da administração acessa o sistema com login e senha.
2. O funcionário seleciona a opção "Cadastrar Fornecedor" no menu.
3. O sistema exibe um formulário de cadastro de fornecedor, solicitando as seguintes informações:
    - Nome do fornecedor.
    - Endereço do fornecedor.
    - Número de telefone do fornecedor.
    - Endereço de e-mail do fornecedor.
    - Outras informações relevantes do fornecedor.
4. O funcionário da administração preenche o formulário com as informações corretas do fornecedor.
5. O funcionário da administração confirma o cadastro do fornecedor.
6. O sistema verifica as informações fornecidas pelo funcionário da administração e as registra no banco de dados.
7. O sistema exibe uma mensagem confirmando que o fornecedor foi cadastrado com sucesso.

Pós-condições:
- O fornecedor está devidamente cadastrado no sistema de gestão de dados do centro universitário.
- O fornecedor pode ser selecionado para futuras transações ou parcerias com o centro universitário.

Cenários Alternativos:
Cenário Alternativo 1 - Dados inválidos no login:
1a. O funcionário insere dados incorretos de login.
1b. Uma mensagem de erro é exibida no sistema informando que os dados de login e/ou senha estão incorretos.
1c. Após confirmação da mensagem de pop-up, o sistema volta a exibir a tela de login e senha para que o processo de autenticação seja refeito.

Cenário Alternativo 2 - Dados inválidos:
5a. O sistema detecta que as informações fornecidas pelo funcionário da administração são inválidas ou estão incompletas.
5b. Uma mensagem de erro é exibida pelo sistema, informando quais campos precisam ser corrigidos.
5c. Após confirmação da mensagem de pop-up, o fluxo retorna para o passo 2, permitindo que o funcionário da administração ajuste as informações do fornecedor.

Cenário Alternativo 3 - Fornecedor já cadastrado:
5a. O sistema identifica que o fornecedor já está cadastrado, com base em critérios como nome ou endereço.
5b. Uma mensagem é exibida pelo sistema, informando que o fornecedor já está cadastrado.
5c. Após confirmação da mensagem de pop-up, o fluxo retorna para o passo 2, permitindo que o funcionário da administração revise ou modifique as informações do fornecedor.

5. Diagrama de Classes

REFERÊNCIAS
1. UML 2 - Uma Abordagem Prática - Gilleanes T. A. Guedes
2. Drawing UML with PlantUML. PlantUML Language Reference Guide. Acesso em: 03. jun. 2023. Disponível em: <https://plantuml.com/guide>
