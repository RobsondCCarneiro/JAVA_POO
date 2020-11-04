package model.exceptions;

/*
 * Foi escolhido que a classe que eu criei chamada de
 * DomainException herdou coisas da classe padrão do
 * JAVA chamada de RuntimeException (aquela que não é
 * necessário tratar as exceções);
 */
public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		//Provavelmente vai invocar sobre o que há na classe RuntimeException
		super(msg);
	}
}
