package com.example.demo;

public class ReflextionExm {
	
	public void method1() {
		
	}
	public void method2() {
		
	}
	public void method3() {
		
	}
	public void method4() {
		
	}
	public void method5() {
		ReflextionExm e = new ReflextionExm();
		e.method1();
		e.method1();
		e.method1();e.method1();
		e.method1();
		e.method1();
		e.method1();
		e.method1();
		e.method1();
		e.method1();
		e.method1();
		e.method1();e.method1();
		e.method1();
	}
//	@GetMapping("/user")
//	public String getUser(@RequestParam String name) {
//	    return "Hello " + name;
//	}
	
//	Method method = controller.getClass().getMethod("getUser", String.class);
//	Parameter[] parameters = method.getParameters();
//
//	for (Parameter param : parameters) {
//	    if (param.isAnnotationPresent(RequestParam.class)) {
//	        RequestParam annotation = param.getAnnotation(RequestParam.class);
//	        String paramName = annotation.value().isEmpty() ? 
//	            param.getName() : annotation.value();  // ← 여기서 매개변수 이름 필요!
//	        
//	        String value = request.getParameter(paramName);
//	        // 메소드 호출
//	        method.invoke(controller, value);
//	    }
//	}
}
