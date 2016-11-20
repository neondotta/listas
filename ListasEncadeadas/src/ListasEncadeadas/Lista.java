package ListasEncadeadas;

public class Lista {

	private Celula primeira;
	private Celula ultima;
	private int totalDeElementos;
	
	  public void adiciona(Object elemento) {
		  if(this.totalDeElementos == 0){
			  adicionaNoComeco(elemento);
		  }else{
			  Celula nova = new Celula(elemento);
			  this.ultima.setProxima(nova);
			  this.ultima = nova;
			  this.totalDeElementos++;
		  }
		  
	  }
	  public void adiciona(int posicao, Object elemento) {
		  if(posicao == 0){
			  adicionaNoComeco(elemento);
		  }else if(posicao == this.totalDeElementos){
			  adiciona(elemento);
		  }else{
			  Celula anterior = this.pegaCelula(posicao - 1);
			  Celula nova = new Celula(anterior.getProxima(), elemento);
			  anterior.setProxima(nova);
			  this.totalDeElementos++;
		  }
	  }
	  public void adicionaNoComeco(Object elemento) {
		  Celula nova = new Celula(this.primeira, elemento);
		  this.primeira = nova;
		  
		  // caso especial da lista vazia
		  if(this.totalDeElementos == 0){
			  this.ultima = this.primeira;
		  }
		  this.totalDeElementos++;
	  }
	  public boolean posicaoOcupada(int posicao){
		  return posicao >= 0 && posicao < this.totalDeElementos;
	  }
	  public Celula pegaCelula(int posicao) {
		  if(!this.posicaoOcupada(posicao)){
			  throw new IllegalArgumentException("Posi��o n�o encontrada");
		  }
		  
		  Celula atual = primeira;
		  for(int i = 0; i < posicao; i++){
			  atual = atual.getProxima();
		  }
		  return atual;
	  }
	  public Object pega(int posicao){
		  return this.pegaCelula(posicao).getElemento();
	  }
	  public void remove(int posicao){}
	  public int tamanho() {return 0;}
	  public boolean contem(Object o) {return false;}
	  public void removeDoComeco() {}
	  public void removeDoFim() {}
	
	  public String toString(){
		  
		  //Verificando se a lista est� vazia.
		  if(this.totalDeElementos == 0){
			  return "[]";
		  }
		  
		  StringBuilder builder = new StringBuilder("[");
		  Celula atual = primeira;
		  
		  //Percorrer at� o pen�ltimo elemento.
		  for(int i = 0; i < this.totalDeElementos - 1;i++){
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProxima();
		  }
		  
		  //�ltimo elemento
		  builder.append(atual.getElemento());
		  builder.append("]");
	  
		  return builder.toString();
	  }
	  
}