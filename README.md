# S-Clothes

Disciplina de Computadores e Sociedade 2019/02

## Basico do projeto

- [Baixar o projeto](#Download)
- [Regras de organização do Git](#Organização)
- [Dicas de como usar o android studio com VCS(version control mananger)](#GitTutorial)
- [Commandos uteis para usar via terminal](#Commands)
- [Dicas de uso no android studio](#TipsAndTricks)

### Atenção

> Todo conteúdo está aberto a mudanças por qualquer membro do grupo, sugestões são bem vindas!

:point_down::smile:

## Download

- Baixar o Android Studio.

- Abrir um novo projeto a partir de controle de versão > Git:

![Recordit GIF](http://g.recordit.co/tQWTX5i3vS.gif)

- Pronto, só configurar um dispositivo android no AVD manager e tudo funcionará.

## Organização

> Regras para manter o minimo de organização do repositório.

- Nunca dar Push na Master com erros no código ou inconsistencia de versão, manter na master a ultima versão estável.

- Cada um cria uma branch a partir da master e trabalha nela.

- Nomeclatura das branches sugiro usar *NomeDoModuloQueEstaotrabalhando*, por exemplo *tela-de-ajuda*. 
Evitar nomes pouco explicativos como *ImplementandoOApp*, *piu1*, etc.

- Quando acabar o desenvolvimento de sua branch dar o [merge](https://git-scm.com/docs/git-merge) na master e resolver os conflitos. 
Depois abrir outra branch com a proxima tarefa.

- Dica: em Insights->Network do github pode-se verificar a timeline dos branches, no android studio também na aba 
Log do Version Control(do lado do terminal no canto inferior esquerdo).

## GitTutorial

_Uma lista dos comandos Git mais usados (útil quando se quer fazer algo pelo git BASH)._


### Criação de Projetos

| Comando | Descrição |
| ------- | --------- |
| `git init` | Inicializa um repositório Git local |
| `git clone ssh://git@github.com/[usuario]/[nome-repositorio].git` | Cria uma cópia local de um repositório remoto |

### Básicos

| Comando | Descrição |
| ------- | --------- |
| `git status` | Checa o status |
| `git add [nome-arquivo.txt]` | Adiciona um arquivo para área de stage |
| `git add -A` | Adiciona todos os arquivos novos ou modificados para a área de stage |
| `git commit -m "[Mensagem de Commit]"` | Comita as alterações |
| `git rm -r [nome-arquivo.txt]` | Remove um arquivo (ou pasta) |
| `git fetch` | Busca e atualiza as branches criadas por outros usuarios |

### Branching & Merging

| Comando | Descrição |
| ------- | --------- |
| `git branch` | Lista as branches (o asterisco denota a branch atual) |
| `git branch -a` | Lista todas as branches (local e remoto) |
| `git branch [nome da branch]` | Cria uma nova branch |
| `git branch -d [nome da branch]` | Deleta uma branch |
| `git push origin --delete [nome da branch]` | Deleta uma branch remota |
| `git checkout -b [nome da branch]` | Cria uma nova branch e muda para ela |
| `git checkout -b [nome da branch] origin/[nome da branch]` | Clona uma branch remota e muda para ela |
| `git checkout [nome da branch]` | Seleciona uma branch |
| `git checkout -` | Muda para a última branch |
| `git checkout -- [nome-arquivo.txt]` | Descarta modificações de um arquivo |
| `git merge [nome da branch]` | Faz um merge de uma branch na branch atual |
| `git merge [source branch] [branch alvo]` | Faz um merge de uma branch em outra branch |
| `git stash` | Tirar o estado sujo do seu diretório de trabalho |
| `git stash clear` | Remove todas as entradas 'stash' |

### Sharing & Updating Projects

| Comando | Descrição |
| ------- | --------- |
| `git push origin [nome da branch]` | Enviar uma branch para seu repositório remoto |
| `git push -u origin [nome da branch]` | Envia as alterações da branch informada para um repositório remoto (and selecionar a branch) |
| `git push` | Envia as alterações para o repositório remoto (branch atual) |
| `git push origin --delete [nome da branch]` | Deletar uma branch remota |
| `git pull` | Atualiza o repositório local para o último commit |
| `git pull origin [nome da branch]` | Recebe alterações do repositório remoto |
| `git remote add origin ssh://git@github.com/[usuario]/[nome-repositorio].git` | Adicionar um repositório remoto |
| `git remote set-url origin ssh://git@github.com/[usuario]/[nome-repositorio].git` | Seta um repositório da origin branch para o SSH |

### Inspeção & Comparação

| Comando | Descrição |
| ------- | --------- |
| `git log` | Ver modificações |
| `git log --summary` | Ver modificações (detalhadas) |
| `git diff [branch original] [branch alvo]` | Visualizar alterações antes de mesclar |

## TipsAndTricks

> Ajudem a preencher :wink:

- Como colocar icons personalizados nas telas e itens:

![Recordit GIF](http://g.recordit.co/w5KTbIo2dm.gif)

## Referencias e agradecimentos

* [Recordit](https://recordit.co/) - Programa usado para gerar os GIFs
