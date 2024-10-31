document.getElementById('addTaskButton').addEventListener('click', addTask);

function addTask() {
    const taskInput = document.getElementById('taskInput');
    const taskText = taskInput.value.trim();

    if (taskText === '') {
        alert('Tugas tidak boleh kosong!');
        return;
    }

    const taskList = document.getElementById('taskList');
    const li = document.createElement('li');
    li.textContent = taskText;

    const editButton = document.createElement('button');
    editButton.textContent = 'Edit';
    editButton.addEventListener('click', () => editTask(taskInput, li));

    const deleteButton = document.createElement('button');
    deleteButton.textContent = 'Hapus';
    deleteButton.addEventListener('click', () => deleteTask(li));

    li.appendChild(editButton);
    li.appendChild(deleteButton);
    taskList.appendChild(li);
    taskInput.value = '';
}

function editTask(taskInput, li) {
    const currentTask = li.firstChild.textContent;
    taskInput.value = currentTask;
    deleteTask(li);
}

function deleteTask(li) {
    li.remove();
}

