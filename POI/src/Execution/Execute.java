package Execution;

import org.testng.annotations.Test;

import Repository.InspectElements;
import Repository.InvokeBrowser;

public class Execute 
{
	@Test
public void exe()
{
	InvokeBrowser.Browser();
	InspectElements.email();
	InspectElements.pwd();
	InvokeBrowser.Clo();
}
}
