package theory;

@SuppressWarnings("ALL")
public class StreamFundamentals {

    /*
    * Stream API
    *
    * Nasceu no java 8 juntamente com as expressões lambda e útil para transformar a Stream API de forma poderosa além de simplificar o desenvolvimento.
    *
    * Toda stream tem uma source, e uma stream é um conjunto de dados que poderão ser transformados conforme os requisitos da aplicação.
    *
    *
    * \ INÍCIO
    *  \                             STREAM API
    *   \                                |
    *    \-> ----------                  V
    *        |        |  STREAM      _________
    *        | SOURCE |  ------->   |   ...   |
    *        |________|             |_________|                   (as streams não alteram a fonte dos dados)
    *         Array                      |  intermediate  <------ Operações Intermediárias (Resultam em outra Stream)
    *         Collection                 |                       |
    *         Generated                  V                       |
    *             .                 -----------                  |
    *             .                 |   ...   |                  |---> Chaining (Encadeamento de Chamadas), código legível e intuitivo
    *             .                 ----------                   |
    *                                    |                       |
    *                                    | intermediate   <-------
    *                                    V
    *                               ----------
    *                               |   ...  | ----------------------> Terminal Operation,
    *                               ----------                         fecha a Stream e encerra o processo com o resultado
    *                                  ^                                   ------------------
    *                                  |                                   \ /////////////// \   FIM
    *                                  |                                     -----------------
    *                              O conjunto de operações (0 ou mais operações intermediárias)
    *                              e uma operação terminal é chamado de
    *                                   PIPELINE
    * */
}
