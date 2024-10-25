package command;

public class OffDevice implements ICommand {

	private IDevice device;

	public OffDevice(IDevice device) {
		this.device = device;
	}

	@Override
	public void operacion() {
		this.device.off();
	}

}
