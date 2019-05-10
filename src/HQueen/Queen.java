package HQueen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor Augusto Pozza
 */
class Queen {
    int indexOfX, indexOfY;

	public Queen(int indexOfX, int indexOfY) {
		this.indexOfX = indexOfX;
		this.indexOfY = indexOfY;
	}



	public void setIndexOfX(int indexOfX) {
		this.indexOfX = indexOfX;
	}

	public void setIndexOfY(int indexOfY) {
		this.indexOfY = indexOfY;
	}

	public int getIndexOfX() {
		return indexOfX;
	}

	public int getIndexOfY() {
		return indexOfY;
	}
        public void moveLeft(){
            indexOfY--;
        }
        public void moveRight(){
            indexOfY++;
        }

    @Override
    public boolean equals(Object obj) {
        Queen next = (Queen)(obj);
        return (next.indexOfX==this.indexOfX && next.indexOfY==this.indexOfY);
}
}
