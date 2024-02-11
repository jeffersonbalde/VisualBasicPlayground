package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,54);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 54;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(4194304);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,87);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 87;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,83);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 83;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(262144);
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendnumbertoactiveinput(RemoteObject _number) throws Exception{
try {
		Debug.PushSubsStack("AppendNumberToActiveInput (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,101);
if (RapidSub.canDelegate("appendnumbertoactiveinput")) { return b4a.example.main.remoteMe.runUserSub(false, "main","appendnumbertoactiveinput", _number);}
Debug.locals.put("number", _number);
 BA.debugLineNum = 101;BA.debugLine="Private Sub AppendNumberToActiveInput(number As St";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="If activeInput <> Null Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("N",main.mostCurrent._activeinput)) { 
 BA.debugLineNum = 103;BA.debugLine="activeInput.Text = activeInput.Text & number";
Debug.ShouldStop(64);
main.mostCurrent._activeinput.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._activeinput.runMethod(true,"getText"),_number)));
 };
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _c_click() throws Exception{
try {
		Debug.PushSubsStack("C_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,108);
if (RapidSub.canDelegate("c_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","c_click");}
 BA.debugLineNum = 108;BA.debugLine="Private Sub C_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="FirstNum.Text = \"\"";
Debug.ShouldStop(4096);
main.mostCurrent._firstnum.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _compute() throws Exception{
try {
		Debug.PushSubsStack("Compute (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,59);
if (RapidSub.canDelegate("compute")) { return b4a.example.main.remoteMe.runUserSub(false, "main","compute");}
 BA.debugLineNum = 59;BA.debugLine="Sub Compute";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Select Case CheckOperator";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(main.mostCurrent._checkoperator,BA.ObjectToString("Divide"),BA.ObjectToString("Multiply"),BA.ObjectToString("Add"))) {
case 0: {
 BA.debugLineNum = 62;BA.debugLine="num1 = FirstNum.Text";
Debug.ShouldStop(536870912);
main._num1 = BA.numberCast(int.class, main.mostCurrent._firstnum.runMethod(true,"getText"));
 BA.debugLineNum = 63;BA.debugLine="num2 = SecondNum.Text";
Debug.ShouldStop(1073741824);
main._num2 = BA.numberCast(int.class, main.mostCurrent._secondnum.runMethod(true,"getText"));
 BA.debugLineNum = 64;BA.debugLine="OverAllTotal = num1 + num2";
Debug.ShouldStop(-2147483648);
main._overalltotal = BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {main._num1,main._num2}, "+",1, 1));
 BA.debugLineNum = 65;BA.debugLine="Total.Text = OverAllTotal";
Debug.ShouldStop(1);
main.mostCurrent._total.runMethod(true,"setText",BA.ObjectToCharSequence(main._overalltotal));
 break; }
case 1: {
 BA.debugLineNum = 68;BA.debugLine="num1 = FirstNum.Text";
Debug.ShouldStop(8);
main._num1 = BA.numberCast(int.class, main.mostCurrent._firstnum.runMethod(true,"getText"));
 BA.debugLineNum = 69;BA.debugLine="num2 = SecondNum.Text";
Debug.ShouldStop(16);
main._num2 = BA.numberCast(int.class, main.mostCurrent._secondnum.runMethod(true,"getText"));
 BA.debugLineNum = 70;BA.debugLine="OverAllTotal = num1 * num2";
Debug.ShouldStop(32);
main._overalltotal = BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {main._num1,main._num2}, "*",0, 1));
 BA.debugLineNum = 71;BA.debugLine="Total.Text = OverAllTotal";
Debug.ShouldStop(64);
main.mostCurrent._total.runMethod(true,"setText",BA.ObjectToCharSequence(main._overalltotal));
 break; }
case 2: {
 BA.debugLineNum = 74;BA.debugLine="num1 = FirstNum.Text";
Debug.ShouldStop(512);
main._num1 = BA.numberCast(int.class, main.mostCurrent._firstnum.runMethod(true,"getText"));
 BA.debugLineNum = 75;BA.debugLine="num2 = SecondNum.Text";
Debug.ShouldStop(1024);
main._num2 = BA.numberCast(int.class, main.mostCurrent._secondnum.runMethod(true,"getText"));
 BA.debugLineNum = 76;BA.debugLine="OverAllTotal = num1 + num2";
Debug.ShouldStop(2048);
main._overalltotal = BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {main._num1,main._num2}, "+",1, 1));
 BA.debugLineNum = 77;BA.debugLine="Total.Text = \"Imissyouuu\"";
Debug.ShouldStop(4096);
main.mostCurrent._total.runMethod(true,"setText",BA.ObjectToCharSequence("Imissyouuu"));
 break; }
}
;
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _divide_click() throws Exception{
try {
		Debug.PushSubsStack("Divide_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,166);
if (RapidSub.canDelegate("divide_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","divide_click");}
 BA.debugLineNum = 166;BA.debugLine="Private Sub Divide_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="CheckOperator = \"Divide\"";
Debug.ShouldStop(64);
main.mostCurrent._checkoperator = BA.ObjectToString("Divide");
 BA.debugLineNum = 168;BA.debugLine="Operator.Text = \"/\"";
Debug.ShouldStop(128);
main.mostCurrent._operator.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("/"));
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dot_click() throws Exception{
try {
		Debug.PushSubsStack("Dot_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,117);
if (RapidSub.canDelegate("dot_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","dot_click");}
 BA.debugLineNum = 117;BA.debugLine="Private Sub Dot_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 119;BA.debugLine="If activeInput = FirstNum Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",main.mostCurrent._activeinput,main.mostCurrent._firstnum)) { 
 BA.debugLineNum = 120;BA.debugLine="FirstNum.Text = FirstNum.Text & \".\"";
Debug.ShouldStop(8388608);
main.mostCurrent._firstnum.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._firstnum.runMethod(true,"getText"),RemoteObject.createImmutable("."))));
 };
 BA.debugLineNum = 123;BA.debugLine="If activeInput = SecondNum Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",main.mostCurrent._activeinput,main.mostCurrent._secondnum)) { 
 BA.debugLineNum = 124;BA.debugLine="SecondNum.Text = SecondNum.Text & \".\"";
Debug.ShouldStop(134217728);
main.mostCurrent._secondnum.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._secondnum.runMethod(true,"getText"),RemoteObject.createImmutable("."))));
 };
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _eight_click() throws Exception{
try {
		Debug.PushSubsStack("Eight_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,175);
if (RapidSub.canDelegate("eight_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","eight_click");}
 BA.debugLineNum = 175;BA.debugLine="Private Sub Eight_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 176;BA.debugLine="FirstNum.Text = FirstNum.Text & \"8\"";
Debug.ShouldStop(32768);
main.mostCurrent._firstnum.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._firstnum.runMethod(true,"getText"),RemoteObject.createImmutable("8"))));
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _equals_click() throws Exception{
try {
		Debug.PushSubsStack("Equals_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,128);
if (RapidSub.canDelegate("equals_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","equals_click");}
 BA.debugLineNum = 128;BA.debugLine="Private Sub Equals_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="Compute";
Debug.ShouldStop(1);
_compute();
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _firstnum_click() throws Exception{
try {
		Debug.PushSubsStack("FirstNum_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,93);
if (RapidSub.canDelegate("firstnum_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","firstnum_click");}
 BA.debugLineNum = 93;BA.debugLine="Sub FirstNum_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="FirstNum = activeInput";
Debug.ShouldStop(536870912);
main.mostCurrent._firstnum = main.mostCurrent._activeinput;
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _five_click() throws Exception{
try {
		Debug.PushSubsStack("Five_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,153);
if (RapidSub.canDelegate("five_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","five_click");}
 BA.debugLineNum = 153;BA.debugLine="Private Sub Five_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="FirstNum.Text = FirstNum.Text & \"5\"";
Debug.ShouldStop(33554432);
main.mostCurrent._firstnum.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._firstnum.runMethod(true,"getText"),RemoteObject.createImmutable("5"))));
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _four_click() throws Exception{
try {
		Debug.PushSubsStack("Four_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,149);
if (RapidSub.canDelegate("four_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","four_click");}
 BA.debugLineNum = 149;BA.debugLine="Private Sub Four_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="FirstNum.Text = FirstNum.Text & \"4\"";
Debug.ShouldStop(2097152);
main.mostCurrent._firstnum.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._firstnum.runMethod(true,"getText"),RemoteObject.createImmutable("4"))));
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private FirstNum As EditText";
main.mostCurrent._firstnum = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Operator As EditText";
main.mostCurrent._operator = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private SecondNum As EditText";
main.mostCurrent._secondnum = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Total As Label";
main.mostCurrent._total = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Seven As Button";
main.mostCurrent._seven = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Eight As Button";
main.mostCurrent._eight = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Nine As Button";
main.mostCurrent._nine = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private Divide As Button";
main.mostCurrent._divide = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private Multiply As Button";
main.mostCurrent._multiply = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private Six As Button";
main.mostCurrent._six = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private Five As Button";
main.mostCurrent._five = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private Four As Button";
main.mostCurrent._four = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private One As Button";
main.mostCurrent._one = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private Two As Button";
main.mostCurrent._two = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private Three As Button";
main.mostCurrent._three = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private Plus As Button";
main.mostCurrent._plus = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private Equals As Button";
main.mostCurrent._equals = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private Dot As Button";
main.mostCurrent._dot = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private Zero As Button";
main.mostCurrent._zero = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private C As Button";
main.mostCurrent._c = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Dim CheckOperator As String";
main.mostCurrent._checkoperator = RemoteObject.createImmutable("");
 //BA.debugLineNum = 45;BA.debugLine="Dim num1 As Int";
main._num1 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 46;BA.debugLine="Dim num2 As Int";
main._num2 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 47;BA.debugLine="Dim OverAllTotal As Double";
main._overalltotal = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 49;BA.debugLine="Dim activeInput As EditText";
main.mostCurrent._activeinput = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _multiply_click() throws Exception{
try {
		Debug.PushSubsStack("Multiply_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,161);
if (RapidSub.canDelegate("multiply_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","multiply_click");}
 BA.debugLineNum = 161;BA.debugLine="Private Sub Multiply_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="CheckOperator = \"Multiply\"";
Debug.ShouldStop(2);
main.mostCurrent._checkoperator = BA.ObjectToString("Multiply");
 BA.debugLineNum = 163;BA.debugLine="Operator.Text = \"X\"";
Debug.ShouldStop(4);
main.mostCurrent._operator.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("X"));
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nine_click() throws Exception{
try {
		Debug.PushSubsStack("Nine_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,171);
if (RapidSub.canDelegate("nine_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","nine_click");}
 BA.debugLineNum = 171;BA.debugLine="Private Sub Nine_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="FirstNum.Text = FirstNum.Text & \"9\"";
Debug.ShouldStop(2048);
main.mostCurrent._firstnum.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._firstnum.runMethod(true,"getText"),RemoteObject.createImmutable("9"))));
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _one_click() throws Exception{
try {
		Debug.PushSubsStack("One_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,145);
if (RapidSub.canDelegate("one_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","one_click");}
 BA.debugLineNum = 145;BA.debugLine="Private Sub One_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="FirstNum.Text = FirstNum.Text & \"1\"";
Debug.ShouldStop(131072);
main.mostCurrent._firstnum.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._firstnum.runMethod(true,"getText"),RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _plus_click() throws Exception{
try {
		Debug.PushSubsStack("Plus_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,132);
if (RapidSub.canDelegate("plus_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","plus_click");}
 BA.debugLineNum = 132;BA.debugLine="Private Sub Plus_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="CheckOperator = \"Add\"";
Debug.ShouldStop(16);
main.mostCurrent._checkoperator = BA.ObjectToString("Add");
 BA.debugLineNum = 134;BA.debugLine="Operator.Text = \"+\"";
Debug.ShouldStop(32);
main.mostCurrent._operator.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("+"));
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _secondnum_click() throws Exception{
try {
		Debug.PushSubsStack("SecondNum_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,97);
if (RapidSub.canDelegate("secondnum_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","secondnum_click");}
 BA.debugLineNum = 97;BA.debugLine="Sub SecondNum_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="SecondNum = activeInput";
Debug.ShouldStop(2);
main.mostCurrent._secondnum = main.mostCurrent._activeinput;
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seven_click() throws Exception{
try {
		Debug.PushSubsStack("Seven_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,179);
if (RapidSub.canDelegate("seven_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","seven_click");}
 BA.debugLineNum = 179;BA.debugLine="Private Sub Seven_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 180;BA.debugLine="FirstNum.Text = FirstNum.Text & \"7\"";
Debug.ShouldStop(524288);
main.mostCurrent._firstnum.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._firstnum.runMethod(true,"getText"),RemoteObject.createImmutable("7"))));
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _six_click() throws Exception{
try {
		Debug.PushSubsStack("Six_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,157);
if (RapidSub.canDelegate("six_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","six_click");}
 BA.debugLineNum = 157;BA.debugLine="Private Sub Six_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="FirstNum.Text = FirstNum.Text & \"6\"";
Debug.ShouldStop(536870912);
main.mostCurrent._firstnum.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._firstnum.runMethod(true,"getText"),RemoteObject.createImmutable("6"))));
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _three_click() throws Exception{
try {
		Debug.PushSubsStack("Three_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,137);
if (RapidSub.canDelegate("three_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","three_click");}
 BA.debugLineNum = 137;BA.debugLine="Private Sub Three_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="FirstNum.Text = FirstNum.Text & \"3\"";
Debug.ShouldStop(512);
main.mostCurrent._firstnum.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._firstnum.runMethod(true,"getText"),RemoteObject.createImmutable("3"))));
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _total_click() throws Exception{
try {
		Debug.PushSubsStack("Total_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,183);
if (RapidSub.canDelegate("total_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","total_click");}
 BA.debugLineNum = 183;BA.debugLine="Private Sub Total_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _two_click() throws Exception{
try {
		Debug.PushSubsStack("Two_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,141);
if (RapidSub.canDelegate("two_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","two_click");}
 BA.debugLineNum = 141;BA.debugLine="Private Sub Two_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="FirstNum.Text = FirstNum.Text & \"2\"";
Debug.ShouldStop(8192);
main.mostCurrent._firstnum.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._firstnum.runMethod(true,"getText"),RemoteObject.createImmutable("2"))));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _zero_click() throws Exception{
try {
		Debug.PushSubsStack("Zero_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,112);
if (RapidSub.canDelegate("zero_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","zero_click");}
 BA.debugLineNum = 112;BA.debugLine="Private Sub Zero_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="activeInput.Text = activeInput.Text & \"0\"";
Debug.ShouldStop(65536);
main.mostCurrent._activeinput.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._activeinput.runMethod(true,"getText"),RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 114;BA.debugLine="AppendNumberToActiveInput(\"0\")";
Debug.ShouldStop(131072);
_appendnumbertoactiveinput(RemoteObject.createImmutable("0"));
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}