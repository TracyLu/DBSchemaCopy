import application.AlreadyExistsException;
import application.ILocalSchemaManagement;
import application.LocalSchemaManagement;

public class Main {
	public static void main(String[] args) {
		ILocalSchemaManagement lsm = new LocalSchemaManagement();
		boolean isExisted = lsm.checkCopyWhetherExists("1");
		if (isExisted) {
			boolean isValid = lsm.validateCopy("1");
			if (!isValid) {
				try {
					lsm.dropCopy("1");
					lsm.createCopy("1");
				} catch (AlreadyExistsException e) {
					e.printStackTrace();
				}
			}
		} else {
			try {
				lsm.createCopy("1");
			} catch (AlreadyExistsException e) {
				e.printStackTrace();
			}
		}
	}
}
