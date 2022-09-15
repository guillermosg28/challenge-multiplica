package com.example.demo;

import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dto.ejercicio01.HabilidadDTO;
import com.example.demo.dto.ejercicio01.RazaDTO;
import com.example.demo.dto.ejercicio01.TipoDTO;
import com.example.demo.dto.ejercicio02.PersonaDTO;
import com.example.demo.dto.ejercicio02.PersonaEsposaDTO;
import com.example.demo.entity.ejercicio03.AlumnoEntity;
import com.example.demo.repository.ejercicio03.AlumnoRepository;
import com.example.demo.service.ejercicio01.HabilidadService;
import com.example.demo.service.ejercicio01.RazaService;
import com.example.demo.service.ejercicio01.TipoService;
import com.example.demo.service.ejercicio02.PersonaService;
import com.example.demo.service.ejercicio03.AlumnoService;
import com.example.demo.service.exceptions.ServiceException;

@SpringBootApplication
public class MultiplicaApplication implements CommandLineRunner {
	
	@Autowired
	private AlumnoService alumnoService;
	
	@Autowired
	private AlumnoRepository alumnoRepository;
		
	@Autowired
	private PersonaService personaService;
	
	@Autowired
	private TipoService tipoService;
	
	@Autowired
	private RazaService razaService;
	
	@Autowired
	private HabilidadService habilidadService;
	
	public MultiplicaApplication(AlumnoService alumnoService,PersonaService personaService) {
		this.alumnoService = alumnoService;
		this.personaService = personaService;
	}

	public static void main(String[] args) {
		SpringApplication.run(MultiplicaApplication.class, args);
	}

	@Override
	public void run(String... args) throws ServiceException {
		
		///////CARGAR DATA
		
		//Ejercicio 01
		saveDataBaseEjercicio01();
		
		
		//Ejercicio 02
		saveDataBaseEjercicio02();
		
		//Ejercicio 03
		saveDataBaseEjercicio03();
		
		///////SOLUCIONES
		
		//EJERCICIO 01
		
		//EJERCICIO 02
		System.out.println(personaService.donantes());
		
		//EJERCICIO 03
		System.out.println(ejercicio_03(1,2));
	}
	
	private void saveDataBaseEjercicio01() throws ServiceException{
		
		//TIPOS
		TipoDTO tipo1 = new TipoDTO();
		tipo1.setNombre("Guerrero");
		tipoService.save(tipo1);
		
		TipoDTO tipo2 = new TipoDTO();
		tipo2.setNombre("Enfermo");
		tipoService.save(tipo2);
		
		//HABILIDADES
		HabilidadDTO habilidad1 = new HabilidadDTO();
		habilidad1.setNombre("Hablar");
		habilidadService.save(habilidad1);
		
		HabilidadDTO habilidad2 = new HabilidadDTO();
		habilidad2.setNombre("Estudiar");
		habilidadService.save(habilidad2);
		
		HabilidadDTO habilidad3 = new HabilidadDTO();
		habilidad3.setNombre("Gritar");
		habilidadService.save(habilidad3);
		
		HabilidadDTO habilidad4 = new HabilidadDTO();
		habilidad4.setNombre("Correr");
		habilidadService.save(habilidad4);
		
		HabilidadDTO habilidad5 = new HabilidadDTO();
		habilidad5.setNombre("Defender");
		habilidadService.save(habilidad5);
		

		HabilidadDTO habilidad6 = new HabilidadDTO();
		habilidad6.setNombre("Atacar");
		habilidadService.save(habilidad6);
		
		HabilidadDTO habilidad7 = new HabilidadDTO();
		habilidad7.setNombre("Hechizar");
		habilidadService.save(habilidad7);
		
		HabilidadDTO habilidad8 = new HabilidadDTO();
		habilidad8.setNombre("Control mental");
		habilidadService.save(habilidad8);
		
		HabilidadDTO habilidad9 = new HabilidadDTO();
		habilidad9.setNombre("Volar");
		habilidadService.save(habilidad9);
		
		HabilidadDTO habilidad10 = new HabilidadDTO();
		habilidad10.setNombre("Sanar");
		habilidadService.save(habilidad10);
		
		//RAZAS
		RazaDTO raza1 = new RazaDTO();
		raza1.setNombre("Protoss");
		raza1.setTipo(tipo1);
		raza1.setPrincipal(true);
		//razaService.save(raza1);
		
		
	};
	
	private void saveDataBaseEjercicio02() throws ServiceException{
		
			PersonaDTO persona1 = new PersonaDTO();
			persona1.setNombre("Pepe");
			persona1.setDonacion(true);
			
			PersonaEsposaDTO esposa11 = new PersonaEsposaDTO();
			esposa11.setNombre("Rosangela");
			PersonaEsposaDTO esposa12 = new PersonaEsposaDTO();
			esposa12.setNombre("Mayte");
			List<PersonaEsposaDTO> esposas1 = Arrays.asList(esposa11,esposa12);
			
			persona1.setEsposas(esposas1);
			
			personaService.save(persona1);
			
			//PERSONA 02
			PersonaDTO persona2 = new PersonaDTO();
			persona2.setNombre("Juan");
			persona2.setDonacion(true);
			
			PersonaEsposaDTO esposa21 = new PersonaEsposaDTO();
			esposa21.setNombre("Yahaira");
			List<PersonaEsposaDTO> esposas2 = Arrays.asList(esposa21);
			
			persona2.setEsposas(esposas2);
			
			personaService.save(persona2);
			
			//PERSONA 03
			PersonaDTO persona3 = new PersonaDTO();
			persona3.setNombre("Lalo");
			persona3.setDonacion(true);
			
			PersonaEsposaDTO esposa31 = new PersonaEsposaDTO();
			esposa31.setNombre("Yanis");
			List<PersonaEsposaDTO> esposas3 = Arrays.asList(esposa31);
			
			persona3.setEsposas(esposas3);
			
			personaService.save(persona3);
			
		
	}
	
	
	private void saveDataBaseEjercicio03() throws ServiceException{
				
		AlumnoEntity alumno1 = new AlumnoEntity("Bar","Reboul","2002-06-12",23.0962864,-82.3614632,1,0,1,1,1,0);
		AlumnoEntity alumno2 = new AlumnoEntity("Rosa","Mines","2001-02-27",32.874735,117.531622,1,1,0,1,1,0);
		AlumnoEntity alumno3 = new AlumnoEntity("Decline","Trosdall","2000-01-06",28.797983,116.070639,0,0,0,0,0,0);
		AlumnoEntity alumno4 = new AlumnoEntity("Julienne","Elt","2000-12-05",-2.804472,129.4844097,1,1,1,1,1,0);
		AlumnoEntity alumno5 = new AlumnoEntity("Rosa","Mines","2001-02-27",32.874735,117.531622,1,1,0,1,1,0);
		AlumnoEntity alumno6 = new AlumnoEntity("Jelene","Oakenford","2002-06-15",32.0747701,-95.5216667,0,0,0,1,1,0);
		
		
		
		List<AlumnoEntity> list = Arrays.asList(alumno1,alumno2,alumno3,alumno4,alumno6,alumno6);
		list.stream().forEach(alumnoRepository::save);
		
	}
	
	private float ejercicio_03(int estudianteUno,int estudianteDos) throws ServiceException {
		float compatibilidad = alumnoService.compatibilidad(estudianteUno,estudianteDos);
		return compatibilidad;
	}

}
