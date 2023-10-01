import stanford.karel.SuperKarel;
/*
 *  კარელი დგას 1x1 უჯრაზე, გაიყვანეთ იგი პირველი ქუჩის ბოლომდე. გაითვალისწინეთ, რომ
სამყაროს ზომა არ იცით. თქვენი პროგრამა უნდა მუშაობდეს ნებისმიერი ზომის
სამყაროსათვის.
 */
public class problem3 extends SuperKarel {
	public void run() {
		while (frontIsClear()) {
			move();
		}
		
	}
	
}